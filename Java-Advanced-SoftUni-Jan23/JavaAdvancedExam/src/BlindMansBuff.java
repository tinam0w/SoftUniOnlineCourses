import java.util.Arrays;
import java.util.Scanner;

public class BlindMansBuff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int currentRow = -1, currentCol = -1;

        String[][] matrix = new String[rows][cols];
        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j].equals("B")){
                    matrix[i][j] = "-";
                    currentRow = i;
                    currentCol = j;
                }
            }
        }

        int touchedPayers = 0, moves = 0;

        String command = scanner.nextLine();
        while (!command.equals("Finish") && touchedPayers < 3){
            int row = currentRow;
            int col = currentCol;

            switch (command){
                case "left": col--; break;
                case "right": col++; break;
                case "up": row--; break;
                case "down": row++; break;
            }

            if (row >= 0 && row < rows && col >= 0 && col < cols) {
                if (matrix[row][col].equals("O")) {
                    command = scanner.nextLine();
                    continue;
                } else if (matrix[row][col].equals("-")) {
                    matrix[currentRow][currentCol] = "-";
                    currentRow = row;
                    currentCol = col;
                    matrix[currentRow][currentCol] = "B";
                    moves++;
                } else if (matrix[row][col].equals("P")) {
                    matrix[currentRow][currentCol] = "-";
                    currentRow = row;
                    currentCol = col;
                    matrix[currentRow][currentCol] = "B";
                    moves++;
                    touchedPayers++;
                }
            }
            command = scanner.nextLine();
        }

        System.out.println("Game over!");
        System.out.printf("Touched opponents: %d Moves made: %d", touchedPayers, moves);
    }
}
