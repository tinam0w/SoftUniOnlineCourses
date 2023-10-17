package JavaAdvanced.MultidimentionalArraysLab;

import java.util.Scanner;

public class diagonalsSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println();

        //not working:
//        for (int i = n - 1; ; i--) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//        }

        for (int i = n - 1, j = 0; j < n; i--, j++) {
            System.out.print(matrix[i][j] + " ");
        }

    }
}
