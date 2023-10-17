package June_2021;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Python {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][n];

        List<String> commands = Arrays.stream(scanner.nextLine().split(",\\s+")).collect(Collectors.toList());
        int row = 0, col = 0;
        int allFood = 0;
        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
            for (int j = 0; j < n; j++) {
                if (matrix[i][j].equals("s")){
                    matrix[i][j] = "*";
                    row = i; col = j;
                } else if (matrix[i][j].equals("f")) {
                    allFood++;
                }
            }
        }

        int snakeLength = 0;
        for (String command : commands) {
            switch (command){
                case "up": row--; break;
                case "down": row++; break;
                case "left": col--; break;
                case "right": col++; break;
            }

            int[] coordinates = repositionPlayer(row, col, matrix);
            row = coordinates[0]; col = coordinates[1];

            if (matrix[row][col].equals("f")){
                snakeLength++;
            } else if (matrix[row][col].equals("e")) {
                break;
            }
        }

        if (snakeLength == allFood){
            System.out.printf("You win! Final python length is %s", snakeLength + 1);
        } else if (matrix[row][col].equals("e")) {
            System.out.println("You lose! Killed by an enemy!");
        } else {
            System.out.printf("You lose! There is still %d food to be eaten.", allFood - snakeLength);
        }
    }
    private static int[] repositionPlayer(int row, int col, String[][] matrix) {
        int[] coordinates = new int[2];

        if (row < 0) row = matrix.length - 1;
        if (row >= matrix.length) row = 0;
        if (col < 0) col = matrix.length - 1;
        if (col >= matrix.length) col = 0;

        coordinates[0] = row; coordinates[1] = col;
        return coordinates;
    }
}
