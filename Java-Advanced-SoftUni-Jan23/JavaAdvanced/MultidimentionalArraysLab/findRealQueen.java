package JavaAdvanced.MultidimentionalArraysLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] matrix = new char[8][8];
        for (int i = 0; i < 8; i++) {
            String[] line = scanner.nextLine().split(" ");
            for (int j = 0; j < 8; j++) {
                matrix[i][j] = line[j].charAt(0);
            }
        }

        List<Integer> rowQueens = new ArrayList<>();
        List<Integer> colQueens = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (matrix[i][j] == 'q') {
                    rowQueens.add(i);
                    colQueens.add(j);
                }
            }
        }

        validRowCol(rowQueens, colQueens);

        for (int i = rowQueens.size() - 1; i >= 0; i--) {
            if (!validDiagonals(rowQueens.get(i), colQueens.get(i), matrix)) {
                rowQueens.remove(i);
                colQueens.remove(i);
            }
        }

        for (int i = 0; i < rowQueens.size(); i++) {
            System.out.println(rowQueens.get(i) + " " + colQueens.get(i));
        }

    }

    private static void validRowCol(List<Integer> rows, List<Integer> cols) {

        for (int i = rows.size() - 1; i > 0; i--) {
            if (rows.get(i) == rows.get(i - 1)) {
                rows.remove(i);
                cols.remove(i);
                rows.remove(i - 1);
                cols.remove(i - 1);
                i = i - 2;
            }
        }
    }

    private static boolean validDiagonals(int a, int b, char[][] matrix) {
        int count = 1;

        int row = a + 1;
        int col = b + 1;
        while (row < matrix.length && col < matrix[row].length) {
            if (matrix[row][col] == 'q') {
                count++;
            }
            row++;
            col++;
        }

        row = a + 1;
        col = b - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == 'q') {
                count++;
            }
            row++;
            col--;
        }

        row = a - 1;
        col = b - 1;
        while (row >= 0 && col >= 0) {
            if (matrix[row][col] == 'q') {
                count++;
            }
            row--;
            col--;
        }

        row = a - 1;
        col = b + 1;
        while (row >= 0 && col < matrix[row].length) {
            if (matrix[row][col] == 'q') {
                count++;
            }
            row--;
            col++;
        }
        return (count == 1);
    }
}