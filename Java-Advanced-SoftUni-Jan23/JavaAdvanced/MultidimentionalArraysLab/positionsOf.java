package JavaAdvanced.MultidimentionalArraysLab;

import java.util.Scanner;

public class positionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimenions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimenions[0]);
        int cols = Integer.parseInt(dimenions[1]);
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = Integer.parseInt(line[col]);
            }
        }

        int number = Integer.parseInt(scanner.nextLine());

        boolean isThere = false;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (matrix[row][col] == number){
                    System.out.println(row + " " + col);
                    isThere = true;
                }
            }
        }
        if (!isThere)
            System.out.println("not found");
    }
}
