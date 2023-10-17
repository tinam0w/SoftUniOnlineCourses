package JavaAdvanced.MultidimentionalArraysExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class rallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String carNumber = scanner.nextLine();

        String[][] trace = new String[n][n];
        fillTheMatrix(trace, scanner);
        int km = 0;

        List<Integer> tunnelCoordinates = new ArrayList<>();
        findTunnels(trace, tunnelCoordinates);

        int currentRow = 0;
        int currentCol = 0;
        String direction = scanner.nextLine();
        while (!direction.equals("End")) {
            switch (direction) {
                case "left":
                    currentCol--;
                    break;
                case "right":
                    currentCol++;
                    break;
                case "up":
                    currentRow--;
                    break;
                case "down":
                    currentRow++;
                    break;
            }
            String movedPlace = trace[currentRow][currentCol];

            if (movedPlace.equals(".")) {
                km += 10;
            } else if (movedPlace.equals("F")) {
                System.out.printf("Racing car %s finishes the stage!%n", carNumber);
                km += 10;
                break;
            } else if (movedPlace.equals("T")) {
                    currentRow = tunnelCoordinates.get(2);
                    currentCol = tunnelCoordinates.get(3);
                    km += 30;
                    trace[tunnelCoordinates.get(0)][tunnelCoordinates.get(1)] = ".";
                    trace[tunnelCoordinates.get(2)][tunnelCoordinates.get(3)] = ".";
            }
            direction = scanner.nextLine();
        }
        if (direction.equals("End")) {
            System.out.printf("Racing car %s DNF.%n", carNumber);
        }
        System.out.printf("Distance covered %d km.%n", km);
        trace[currentRow][currentCol] = "C";

        for (int row = 0; row < trace.length; row++) {
            for (int col = 0; col < trace.length; col++) {
                System.out.print(trace[row][col]);
            }
            System.out.println();
        }
    }

    private static void fillTheMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }

    private static void findTunnels(String[][] trace, List<Integer> tunnelCoor) {
        for (int row = 0; row < trace.length; row++) {
            for (int col = 0; col < trace.length; col++) {
                if (trace[row][col].equals("T")) {
                    tunnelCoor.add(row);
                    tunnelCoor.add(col);
                }
            }
        }
    }
}
