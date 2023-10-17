package August_2021;

import java.util.Scanner;

public class FormulaOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int count = Integer.parseInt(scanner.nextLine());

        String [][] matrix = new String[n][n];
        int row = 0, col = 0;
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split("");
            for (int j = 0; j < n; j++) {
                if (matrix[i][j].equals("P")){
                    matrix[i][j] = ".";
                    row = i; col = j;
                }
            }
        }

        boolean isWinner = false;
        for (int i = 0; i < count; i++) {
            String command = scanner.nextLine();
            int newRow = row, newCol = col;

            switch (command){
                case "left": newCol--; break;
                case "right": newCol++; break;
                case "up": newRow--; break;
                case "down": newRow++; break;
            }

            int[] coordinates = repositionPlayer(newRow, newCol, matrix);
            newRow = coordinates[0]; newCol = coordinates[1];

            if (matrix[newRow][newCol].equals("B")){
                switch (command){
                    case "left": newCol--; break;
                    case "right": newCol++; break;
                    case "up": newRow--; break;
                    case "down": newRow++; break;
                }

                coordinates = repositionPlayer(newRow, newCol, matrix);
                newRow = coordinates[0]; newCol = coordinates[1];

                if (matrix[newRow][newCol].equals("F")){
                    row = newRow; col = newCol;
                    isWinner = true;
                    break;
                }

            } else if (matrix[newRow][newCol].equals("T")) {
                newRow = row; newCol = col;

            } else if (matrix[newRow][newCol].equals("F")) {
                row = newRow; col = newCol;
                isWinner = true;
                break;
            }
            row = newRow; col = newCol;
        }

        matrix[row][col] = "P";
        if (isWinner){
            System.out.println("Well done, the player won first place!");
        } else {
            System.out.println("Oh no, the player got lost on the track!");
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    private static int[] repositionPlayer(int row, int col, String[][] matrix) {
        int[] coordinates = new int[2];

        if (row < 0) row = matrix.length - 1;
        if (row >= matrix.length) row = 0;
        if (col < 0) col = matrix.length - 1;
        if (col >= matrix.length) col = 0;

        coordinates[0] = row; coordinates[1] = col;
        return coordinates;
    }
}
