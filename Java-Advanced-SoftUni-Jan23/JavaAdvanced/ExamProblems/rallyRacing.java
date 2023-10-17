package JavaAdvanced.ExamProblems;

import java.util.Scanner;

public class rallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][n];
        String carNumber = scanner.nextLine();

        fillTheMatrix(matrix, scanner);

        int carRow = 0;
        int carCol = 0;
        int km = 0;

        String direction = scanner.nextLine();
        while (!direction.equals("End")) {
            if (direction.equals("left"))
                carCol--;
            if (direction.equals("right"))
                carCol++;
            if (direction.equals("up"))
                carRow--;
            if (direction.equals("down"))
                carRow++;

            String currentPosition = matrix[carRow][carCol];
            if (currentPosition.equals(".")) {
                km += 10;
            } else if (currentPosition.equals("T")) {
                matrix[carRow][carCol] = ".";
                int[] newCoordinates = findNextTunnel(matrix);
                carRow = newCoordinates[0];
                carCol = newCoordinates[1];
                matrix[carRow][carCol] = ".";
                km += 30;
            } else if (currentPosition.equals("F")) {
                km += 10;
                matrix[carRow][carCol] = "C";
                System.out.println("Racing car " + carNumber + " finished the stage!");
                System.out.println("Distance covered " + km + " km.");
                printTheMatrix(matrix);
                return;
            }
            direction = scanner.nextLine();
        }
        matrix[carRow][carCol] = "C";
        System.out.println("Racing car " + carNumber + " DNF.");
        System.out.println("Distance covered " + km + " km.");
        printTheMatrix(matrix);
    }

    private static void printTheMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[] findNextTunnel(String[][] matrix) {
        int[] coordinates = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("T")) {
                    coordinates[0] = i;
                    coordinates[1] = j;
                }
            }
        }
        return coordinates;
    }

    private static void fillTheMatrix(String[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }
    }
}
