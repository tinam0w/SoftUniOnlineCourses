package JavaAdvanced.MultidimentionalArraysExercise;

import java.util.*;

public class crossfire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        List<List<String>> matrix = new ArrayList<>();

        fillMatrix(rows, cols, matrix);

        String input = scanner.nextLine();
        while (!input.equals("Nuke it from orbit")) {
            int hitRow = Integer.parseInt(input.split("\\s+")[0]);
            int hitCol = Integer.parseInt(input.split("\\s+")[1]);
            int hitRadius = Integer.parseInt(input.split("\\s+")[2]);

                for (int i = hitRow - hitRadius; i <= hitRow + hitRadius; i++) {
                    if (isItIn(i, hitCol, matrix) && i != hitRow)
                        matrix.get(i).remove(hitCol);
                }
                for (int i = hitCol + hitRadius; i >= hitCol - hitRadius; i--) {
                    if (isItIn(hitRow, i, matrix))
                        matrix.get(hitRow).remove(i);
                }
            matrix.removeIf(List::isEmpty);
            input = scanner.nextLine();
        }
        printMatrix(matrix);
    }

    private static void fillMatrix(int rows, int cols, List<List<String>> matrix) {
        int count = 1;
        for (int i = 0; i < rows; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < cols; j++) {
                matrix.get(i).add(count + "");
                count++;
            }
        }
    }

    private static boolean isItIn(int row, int col, List<List<String>> matrix) {
        return row >= 0 && row < matrix.size() && col >= 0 && col < matrix.get(row).size();
    }

    private static void printMatrix(List<List<String>> matrix) {
        for (int i = 0; i < matrix.size(); i++) {
            for (int j = 0; j < matrix.get(i).size(); j++) {
                System.out.print(matrix.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
