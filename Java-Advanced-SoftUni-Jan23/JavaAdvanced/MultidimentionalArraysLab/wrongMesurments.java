package JavaAdvanced.MultidimentionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class wrongMesurments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[rows][];
        int cols = 0;
        for (int i = 0; i < rows; i++) {
            int[] line = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            cols = line.length;
            for (int j = 0; j < line.length; j++) {
                matrix[i] = line;
            }
        }

        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int c = Integer.parseInt(input[1]);
        int number = matrix[r][c];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == number){
                    matrix[i][j] = sumMethod(i,j,matrix);
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int sumMethod(int row, int col, int[][] matrix) {
        int sum = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (row > 0 && col > 0 && row < rows - 1 && col < cols - 1) {
            sum = matrix[row - 1][col] + matrix[row + 1][col] +
                    matrix[row][col - 1] + matrix[row][col + 1];
        } else if (row == 0 && col == 0 ) {
            sum = matrix[1][0] + matrix[0][1];
        } else if (row == 0 && col == cols - 1) {
            sum = matrix[0][col - 1] + matrix[1][col];
        } else if (row == rows  -1 && col == 0) {
            sum = matrix[row - 1][0] + matrix[rows - 1][1];
        } else if (row == rows - 1 && col == cols - 1) {
            sum = matrix[row][col - 1] + matrix[row - 1][col];
        } else if (row > 0 && row < rows - 1 && col == 0) {
            sum = matrix[row - 1][0] + matrix[row + 1][0] + matrix[row][col + 1];
        } else if (row == 0 && row < rows - 1 && col > 0 && col < cols - 1) {
            sum = matrix[row][col - 1] + matrix[row][col + 1] + matrix[row + 1][col];
        } else if (row > 0 && row < rows - 1 && col == cols - 1) {
            sum = matrix[row - 1][col] + matrix[row + 1][col] + matrix[row][col - 1];
        } else if (row == 0 && col > 0 && col < cols - 1) {
            sum = matrix[row][col - 1] + matrix[row][col + 1] + matrix[row - 1][col];
        }

        return sum;
    }
}
