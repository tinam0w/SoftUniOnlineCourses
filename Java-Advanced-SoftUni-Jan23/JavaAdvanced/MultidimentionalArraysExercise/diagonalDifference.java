package JavaAdvanced.MultidimentionalArraysExercise;

import java.util.Scanner;

public class diagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int [][] matrix = new int[n][n];

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                matrix [row][col] = scanner.nextInt();
            }
        }

        int sumPrimaryD = 0;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = col; row < col + 1; row++) {
                sumPrimaryD += matrix[row][col];
            }
        }

        int sumSecondaryD = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                int current = matrix[row][col];
                if (col == matrix.length - row - 1){
                    sumSecondaryD += current;
                }
            }
        }

        int difference = Math.abs(sumPrimaryD - sumSecondaryD);
        System.out.println(difference);
    }
}
