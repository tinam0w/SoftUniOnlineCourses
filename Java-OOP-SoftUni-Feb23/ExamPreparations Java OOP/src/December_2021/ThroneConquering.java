package December_2021;

import java.util.Scanner;

public class ThroneConquering {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int energy = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][];
        int row = 0, col = 0;

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split("");
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("P")) {
                    matrix[i][j] = "-";
                    row = i;
                    col = j;
                }
            }
        }

        boolean helenAbducted = false;
        while (energy > 0) {
            String[] command = scanner.nextLine().split("\\s+");

            int enemyRow = Integer.parseInt(command[1]),
                    enemyCol = Integer.parseInt(command[2]);
            matrix[enemyRow][enemyCol] = "S";

            int newRow = row, newCol = col;
            switch (command[0]) {
                case "up": newRow--; break;
                case "down": newRow++; break;
                case "left": newCol--; break;
                case "right": newCol++; break;
            }
            energy--;

            if (newRow < 0 || newRow >= matrix.length ||
                    newCol < 0 || newCol >= matrix[row].length){
                continue;
            } else {
                row = newRow;
                col = newCol;
            }

            if (matrix[row][col].equals("S")){
                energy -= 2;
                matrix[row][col] = "-";
            }

            if (matrix[row][col].equals("H")){
                matrix[row][col] = "-";
                helenAbducted = true;
                break;
            }
        }

        if (energy <= 0){
            matrix[row][col] = "X";
            System.out.printf("Paris died at %d;%d.%n", row, col);
        }
        if (helenAbducted){
            System.out.println("Paris has successfully abducted Helen! Energy left: " + energy);
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
