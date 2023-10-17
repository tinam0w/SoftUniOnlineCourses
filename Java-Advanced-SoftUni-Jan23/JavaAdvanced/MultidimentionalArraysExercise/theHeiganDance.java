package JavaAdvanced.MultidimentionalArraysExercise;

import java.util.Scanner;

public class theHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int playerRow = 7;
        int playerCol = 7;
        int[][] matrix = new int[15][15];
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                matrix[i][j] = 0;
            }
        }

        int playerPoints = 18500;
        double heiganPoints = 3000000;
        double damageToHeigan = Double.parseDouble(scanner.nextLine());
        String lastSpell = "";

        String input = scanner.nextLine();

        while (playerPoints > 0 && heiganPoints > 0) {
            String spell = input.split("\\s+")[0];
            heiganPoints -= damageToHeigan;

            int hitRow = Integer.parseInt(input.split("\\s+")[1]);
            int hitCol = Integer.parseInt(input.split("\\s+")[2]);

            if (lastSpell.equals("Cloud")) {
                playerPoints -= 3500;
            }
            hitByHeigan(hitRow, hitCol, matrix);

            if (spell.equals("Cloud")) {
                if (matrix[playerRow][playerCol] > 0) {
                    int[] playersCoor = playerTriesToMove(playerRow, playerCol, matrix);
                    if (playersCoor[0] != playerRow || playersCoor[1] != playerCol) {
                        playerRow = playersCoor[0];
                        playerCol = playersCoor[1];
                        lastSpell = "";
                    } else {
                        playerPoints -= 3500;
                        lastSpell = "Cloud";
                    }
                }
                emptyMatrix(matrix);

            } else if (spell.equals("Eruption")) {
                if (matrix[playerRow][playerCol] > 0) {
                    int[] playersCoor = playerTriesToMove(playerRow, playerCol, matrix);
                    if (playersCoor[0] != playerRow || playersCoor[1] != playerCol) {
                        playerRow = playersCoor[0];
                        playerCol = playersCoor[1];
                    } else {
                        playerPoints -= 6000;
                    }
                    lastSpell = "Eruption";
                }
                emptyMatrix(matrix);
            }
            if (playerPoints > 0)
                input = scanner.nextLine();
        }
        //принтиране
        if (lastSpell.equals("Cloud"))
            lastSpell = "Plague Cloud";
        if (heiganPoints <= 0) {
            System.out.println("Heigan: Defeated!");
        } else {
            System.out.printf("Heigan: %.2f%n", heiganPoints);
        }
        if (playerPoints <= 0) {
            System.out.println("Player: Killed by " + lastSpell);
        } else {
            System.out.printf("Player: %d%n", playerPoints);
        }
        System.out.printf("Final position: %d, %d%n", playerRow, playerCol);
    }

    private static boolean isValidIndexes(int row, int col, int[][] matrix) {
        return row >= 0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length;
    }

    private static void emptyMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    private static int[] playerTriesToMove(int row, int col, int[][] matrix) {
        int[] result = new int[2];
        result[0] = row;
        result[1] = col;

        if (isValidIndexes(row - 1, col, matrix) &&
                matrix[row - 1][col] == 0) { //up
            result[0] = row - 1;
        } else if (isValidIndexes(row, col + 1, matrix) && //right
                matrix[row][col + 1] == 0) {
            result[1] = col + 1;
        } else if (isValidIndexes(row + 1, col, matrix) && //down
                matrix[row + 1][col] == 0) {
            result[0] = row + 1;
        } else if (isValidIndexes(row, col - 1, matrix) && //left
                matrix[row][col - 1] == 0) {
            result[1] = col - 1;
        }
        return result;

    }

    private static void hitByHeigan(int row, int col, int[][] matrix) {

        if (isValidIndexes(row, col, matrix)) {
            matrix[row][col] = 1;
        }
        if (isValidIndexes(row - 1, col - 1, matrix)) {
            matrix[row - 1][col - 1] = 1;
        }
        if (isValidIndexes(row + 1, col + 1, matrix)) {
            matrix[row + 1][col + 1] = 1;
        }
        if (isValidIndexes(row, col - 1, matrix)) {
            matrix[row][col - 1] = 1;
        }
        if (isValidIndexes(row, col + 1, matrix)) {
            matrix[row][col + 1] = 1;
        }
        if (isValidIndexes(row - 1, col, matrix)) {
            matrix[row - 1][col] = 1;
        }
        if (isValidIndexes(row + 1, col, matrix)) {
            matrix[row + 1][col] = 1;
        }
        if (isValidIndexes(row + 1, col - 1, matrix)) {
            matrix[row + 1][col - 1] = 1;
        }
        if (isValidIndexes(row - 1, col + 1, matrix)) {
            matrix[row - 1][col + 1] = 1;
        }
    }
}
