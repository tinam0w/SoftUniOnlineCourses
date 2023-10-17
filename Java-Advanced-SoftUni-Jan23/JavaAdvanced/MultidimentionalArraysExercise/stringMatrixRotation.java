package JavaAdvanced.MultidimentionalArraysExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class stringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotateCommand = scanner.nextLine();
        int rotateDeg = Integer.parseInt(rotateCommand.replaceAll("\\D+", ""));
        int rotations = (rotateDeg % 360) / 90;

        String input = scanner.nextLine();
        List<String> linesList = new ArrayList<>();

        while (!input.equals("END")) {
            linesList.add(input);
            input = scanner.nextLine();
        }

        int rows = linesList.size();
        int cols = 0;
        for (String word : linesList) {
            if (word.length() > cols)
                cols = word.length();
        }

        char[][] matrix = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j < linesList.get(i).length()){
                    matrix[i][j] = linesList.get(i).charAt(j);
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }

        if (rotations == 1){
            for (int col = 0; col < cols; col++) {
                for (int row = rows - 1; row >= 0 ; row--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (rotations == 2) {
            for (int row = rows - 1; row >= 0 ; row--) {
                for (int col = cols - 1; col >= 0 ; col--) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else if (rotations == 3) {
            for (int col = cols - 1; col >= 0 ; col--) {
                for (int row = 0; row < rows; row++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        } else {
            for (int row = 0; row < rows; row++) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(matrix[row][col]);
                }
                System.out.println();
            }
        }

    }
}
