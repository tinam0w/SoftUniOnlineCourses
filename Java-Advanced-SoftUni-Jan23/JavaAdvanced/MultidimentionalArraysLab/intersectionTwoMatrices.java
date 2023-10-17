package JavaAdvanced.MultidimentionalArraysLab;

import java.util.Scanner;

public class intersectionTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        char[][] secondMatrix = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                firstMatrix[i][j] = line[j].charAt(0);
            }
        }

        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                secondMatrix[i][j] = line[j].charAt(0);
            }
        }

        char[][] resultMatrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (firstMatrix[i][j] == secondMatrix[i][j]){
                    resultMatrix[i][j] = firstMatrix[i][j];
                } else {
                    resultMatrix[i][j] = '*';
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
