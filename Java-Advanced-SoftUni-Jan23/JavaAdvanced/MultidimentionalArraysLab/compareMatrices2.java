package JavaAdvanced.MultidimentionalArraysLab;

import java.util.Scanner;

public class compareMatrices2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimentions1 = scanner.nextLine().split("\\s+");
        int oneRow = Integer.parseInt(dimentions1[0]);
        int oneCol = Integer.parseInt(dimentions1[1]);
        int[][] oneMatrix = new int[oneRow][oneCol];

        for (int row = 0; row < oneRow; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < oneCol; col++) {
                oneMatrix[row][col] = Integer.parseInt(line[col]);
            }
        }

        String[] dimentions2 = scanner.nextLine().split("\\s+");
        int twoRow = Integer.parseInt(dimentions2[0]);
        int twoCol = Integer.parseInt(dimentions2[1]);
        int[][] twoMatrix = new int[twoRow][twoCol];

        for (int row = 0; row < twoRow; row++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int col = 0; col < twoCol; col++) {
                twoMatrix[row][col] = Integer.parseInt(line[col]);
            }
        }

        if (oneCol != twoCol || oneRow != twoRow){
            System.out.println("not equal");
            return;
        }
        boolean areEqual = true;
        for (int row = 0; row < oneRow; row++) {
            for (int col = 0; col < oneCol; col++) {
                if (oneMatrix[row][col] != twoMatrix[row][col]){
                    areEqual = false;
                    break;
                }
            }
            if (!areEqual)
                break;
        }
        if (areEqual)
            System.out.println("equal");
        else
            System.out.println("not equal");
    }
}
