package JavaAdvanced.MultidimentionalArraysExercise;

import java.util.Scanner;

public class fillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int n = Integer.parseInt(input[0]);
        String pattern = input[1];

        int [][] matrix = new int [n][n];

        if (pattern.equals("A")){
            fillMatrixPatternA(matrix);
        } else if (pattern.equals("B")) {
            fillMatrixPatternB(matrix);
        }

        printMatrix(matrix);

    }
    public static void fillMatrixPatternA(int [][] matrix){
        int number = 1;
        for (int col = 0; col < matrix.length; col++) { //обхождаме по колони
            for (int row = 0; row < matrix.length; row++) { //обхождане по редове
                matrix[row][col] = number;
                number++;
            }
        }
    }
    public static void fillMatrixPatternB(int [][] matrix){
        int number = 1;
        for (int col = 0; col < matrix.length; col++) { //обхождаме колоните
            if (col % 2 != 0){        //обхождаме четни редове
                for (int row = matrix.length - 1; row >= 0; row--) {
                    matrix[row][col] = number;
                    number++;
                }
            } else{                 //обхождаме нечетни редове
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = number;
                    number++;
                }
            }
        }
    }
    private static void printMatrix(int [][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
