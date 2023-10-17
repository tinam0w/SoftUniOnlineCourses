package JavaAdvanced.ExamProblems;

import java.util.Scanner;

public class stickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[rows][rows];
        String[] directions = scanner.nextLine().split(",");

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        int rowThief = -1;
        int colThief = -1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (matrix[i][j].equals("D")) {
                    rowThief = i;
                    colThief = j;
                    break;
                }
            }
        }

        //    НЕ РАБОТИ !!!
//        int[] d = findD(matrix);
//        rowThief = d[0];
//        colThief = d[1];

        int totalStolenMoney = 0;

        for (String direction : directions) {
            switch (direction) {
                case "left":
                    if (isInMatrix(rowThief, colThief - 1, matrix)) {
                        matrix[rowThief][colThief] = "+";
                        colThief--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "right":
                    if (isInMatrix(rowThief, colThief + 1, matrix)) {
                        matrix[rowThief][colThief] = "+";
                        colThief++;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "up":
                    if (isInMatrix(rowThief - 1, colThief, matrix)) {
                        matrix[rowThief][colThief] = "+";
                        rowThief--;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
                case "down":
                    if (isInMatrix(rowThief + 1, colThief, matrix)) {
                        matrix[rowThief][colThief] = "+";
                        rowThief++;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                    }
                    break;
            }

            String currentPosition = matrix[rowThief][colThief];
            if (currentPosition.equals("$")) {
                int stolenMoney = rowThief * colThief;
                totalStolenMoney += stolenMoney;
                System.out.printf("You successfully stole %d$.%n", stolenMoney);
                matrix[rowThief][colThief] = "D";
            } else if (currentPosition.equals("P")) {
                System.out.printf("You got caught with %d$, and you are going to jail.%n", totalStolenMoney);
                matrix[rowThief][colThief] = "#";
                printMatrix(matrix);
                return;
            } else if (currentPosition.equals("+")) {
                matrix[rowThief][colThief] = "D";
            }
        }
        System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", totalStolenMoney);
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

//    private static int[] findD(String[][] matrix) {
//        int[] d = new int[2];
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][i].equals("D")) {
//                    d[0] = i;
//                    d[1] = j;
//                    break;
//                }
//            }
//        }
//        return d;
//    }

    private static boolean isInMatrix(int a, int b, String[][] matrix) {
        return a >= 0 && a < matrix.length && b >= 0 && b < matrix[0].length;
    }
}
