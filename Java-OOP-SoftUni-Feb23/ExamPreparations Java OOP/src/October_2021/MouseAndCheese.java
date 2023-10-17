package October_2021;

import java.util.Scanner;

public class MouseAndCheese {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][n];

        int row = 0, col = 0;
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split("");
            for (int j = 0; j < n; j++) {
                if (matrix[i][j].equals("M")) {
                    matrix[i][j] = "-";
                    row = i;
                    col = j;
                }
            }
        }

        int cheese = 0;
        String command = scanner.nextLine();
        while (!command.equals("end")) {

            switch (command) {
                case "left": col--; break;
                case "right": col++; break;
                case "up": row--; break;
                case "down": row++; break;
            }

            if (!isItOut(row, col, matrix)) {
                if (matrix[row][col].equals("c")) {
                    matrix[row][col] = "-";
                    cheese++;
                } else if (matrix[row][col].equals("B")) {
                    matrix[row][col] = "-";
                    switch (command) {
                        case "left": col--; break;
                        case "right": col++; break;
                        case "up": row--; break;
                        case "down": row++; break;
                    }
                    if (!isItOut(row, col, matrix)) {
                        if (matrix[row][col].equals("c")) {
                            matrix[row][col] = "-";
                            cheese++;
                        }
                    } else {
                        System.out.println("Where is the mouse?");
                        break;
                    }
                }
            } else {
                System.out.println("Where is the mouse?");
                break;
            }
            command = scanner.nextLine();
        }

        if (!isItOut(row, col, matrix))
            matrix[row][col] = "M";

        if (cheese >= 5){
            System.out.println("Great job, the mouse is fed " + cheese + " cheeses!");
        } else {
            System.out.println("The mouse couldn't eat the cheeses, she needed " + (5 - cheese) + " cheeses more.");
        }
        printMatrix(matrix);
    }

    private static boolean isItOut(int row, int col, String[][] matrix) {
        return row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length;
    }
    private static void printMatrix(String[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
