package JavaAdvanced.MultidimentionalArraysLab;

import java.util.Scanner;

public class maximumSumSubmatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimentions = scanner.nextLine().split(", ");
        int rows = Integer.parseInt(dimentions[0]);
        int cols = Integer.parseInt(dimentions[1]);

        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split(", ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int maxSum = 0;
        int maxRow = -1;
        int maxCol = -1;
        for (int i = 0; i < rows-1; i++) {
            for (int j = 0; j < cols-1; j++) {
                int sum = matrix[i][j] + matrix[i][j+1] +
                        matrix[i+1][j] + matrix[i+1][j+1];
                if (sum > maxSum){
                    maxSum = sum;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        for (int row = maxRow; row < maxRow + 2; row++) {
            for (int col = maxCol; col < maxCol + 2; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
}
