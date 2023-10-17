package February_2022;

import java.util.Scanner;

public class PawnWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[][] matrix = new String[8][8];
        int whiteRow = -1, whiteCol = -1;
        int blackRow = -1, blackCol = -1;

        for (int i = 0; i < 8; i++) {
            matrix[i] = scanner.nextLine().split("");
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j].equals("w")){
                    whiteRow = i; whiteCol = j;
                }
                if (matrix[i][j].equals("b")){
                    blackRow = i; blackCol = j;
                }
            }
        }

        while (true){
            if (isBlackAround(whiteRow, whiteCol, matrix)) {
                String black = getCoordinates(blackRow, blackCol);
                System.out.printf("Game over! White capture on %s.%n", black);
                return;
            }

            whiteRow--;

            if (whiteRow <= 0) {
                String white = getCoordinates(whiteRow, whiteCol);
                System.out.printf("Game over! White pawn is promoted to a queen at %s.%n", white);
                return;
            }

            if (isWhiteAround(blackRow, blackCol, matrix)) {
                String white = getCoordinates(whiteRow, whiteCol);
                System.out.printf("Game over! Black capture on %s.%n", white);
                return;
            }

            blackRow++;

            if (blackRow >= 7) {
                String black = getCoordinates(blackRow, blackCol);
                System.out.printf("Game over! Black pawn is promoted to a queen at %s.%n", black);
                return;
            }
        }
    }

    private static boolean isWhiteAround(int blackRow, int blackCol, String[][] matrix) {
        if (isItInMatrix(blackRow - 1, blackCol - 1))
            if (matrix[blackRow - 1][blackCol - 1].equals("w"))
                return true;
        if (isItInMatrix(blackRow - 1, blackCol + 1))
            if (matrix[blackRow - 1][blackCol + 1].equals("w"))
                return true;
        if (isItInMatrix(blackRow + 1, blackCol - 1))
            if (matrix[blackRow + 1][blackCol - 1].equals("w"))
                return true;
        if (isItInMatrix(blackRow + 1, blackCol + 1))
            if (matrix[blackRow + 1][blackCol + 1].equals("w"))
                return true;
        return false;
    }
    private static boolean isBlackAround(int whiteRow, int whiteCol, String[][] matrix) {
        if (isItInMatrix(whiteRow - 1, whiteCol - 1))
            if (matrix[whiteRow - 1][whiteCol - 1].equals("b"))
                return true;
        if (isItInMatrix(whiteRow - 1, whiteCol + 1))
            if (matrix[whiteRow - 1][whiteCol + 1].equals("b"))
                return true;
        if (isItInMatrix(whiteRow + 1, whiteCol - 1))
            if (matrix[whiteRow + 1][whiteCol - 1].equals("b"))
                return true;
        if (isItInMatrix(whiteRow + 1, whiteCol + 1))
            if (matrix[whiteRow + 1][whiteCol + 1].equals("b"))
                return true;
        return false;
    }
    private static boolean isItInMatrix(int row,int col){
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
    private static String getCoordinates(int row, int col) {
        StringBuilder sb = new StringBuilder();
        switch (col){
            case 0: sb.append("a"); break;
            case 1: sb.append("b"); break;
            case 2: sb.append("c"); break;
            case 3: sb.append("d"); break;
            case 4: sb.append("e"); break;
            case 5: sb.append("f"); break;
            case 6: sb.append("g"); break;
            case 7: sb.append("h"); break;
        }
        switch (row){
            case 0: sb.append("8"); break;
            case 1: sb.append("7"); break;
            case 2: sb.append("6"); break;
            case 3: sb.append("5"); break;
            case 4: sb.append("4"); break;
            case 5: sb.append("3"); break;
            case 6: sb.append("2"); break;
            case 7: sb.append("1"); break;
        }
        return sb.toString();
    }
}
