package October_2022;

import java.util.Scanner;

public class RallyRacing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String number = scanner.nextLine();
        String[][] matrix = new String[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        int rowCar = 0, colCar = 0, km = 0;
        boolean isFinish = false;

        String direction = scanner.nextLine();
        while (!direction.equals("End")) {
            switch (direction) {
                case "left":
                    colCar--;
                    break;
                case "right":
                    colCar++;
                    break;
                case "up":
                    rowCar--;
                    break;
                case "down":
                    rowCar++;
                    break;
            }

            if (matrix[rowCar][colCar].equals("T")) {
                matrix[rowCar][colCar] = ".";
                rowCar = findTunnel(matrix)[0];
                colCar = findTunnel(matrix)[1];
                matrix[rowCar][colCar] = ".";
                km += 30;
            } else if (matrix[rowCar][colCar].equals("F")) {
                km += 10;
                isFinish = true;
                break;
            } else {
                km += 10;
            }

            direction = scanner.nextLine();
        }

        if (isFinish) {
            System.out.println("Racing car " + number + " finished the stage!");
        } else {
            System.out.println("Racing car " + number + " DNF.");
        }
        System.out.println("Distance covered " + km + " km.");

        matrix[rowCar][colCar] = "C";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[] findTunnel(String[][] matrix) {
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
}
