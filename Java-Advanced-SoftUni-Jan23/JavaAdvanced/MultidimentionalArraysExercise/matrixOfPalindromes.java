package JavaAdvanced.MultidimentionalArraysExercise;

import java.util.Scanner;

public class matrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        String [][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                String toPrint = "" + (char)(97 + row) + (char)(97 + col + row) + (char)(97 + row) + " ";
                System.out.print(toPrint);
            }
            System.out.println();
        }
    }
}
