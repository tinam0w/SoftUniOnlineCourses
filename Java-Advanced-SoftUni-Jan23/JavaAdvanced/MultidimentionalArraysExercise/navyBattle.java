package JavaAdvanced.MultidimentionalArraysExercise;

import java.util.Scanner;

public class navyBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][n];

        for (int i = 0; i < n; i++) {
            String[] line = scanner.nextLine().split("");
            for (int j = 0; j < n; j++) {
                matrix[i][j] = line[j] + "";
            }
        }

        //къде се намира подводницата:
        int rowSub = -1;
        int colSub = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j].equals("S")) {
                    rowSub = i;
                    colSub = j;
                    break;
                }
            }
        }

        int countMines = 0;
        int countCs = 0;
        String command = scanner.nextLine();
        while (true) {
            matrix[rowSub][colSub] = "-";
            if (command.equals("up")) {
                rowSub--;
            } else if (command.equals("down")) {
                rowSub++;
            } else if (command.equals("left")) {
                colSub--;
            } else if (command.equals("right")) {
                colSub++;
            }
            String newPosition = matrix[rowSub][colSub];
            if (newPosition.equals("-")){
                matrix[rowSub][colSub] = "S";
            } else if (newPosition.equals("*")) {
                matrix[rowSub][colSub] = "S";
                countMines++;
                if (countMines > 2){
                    System.out.printf("Mission failed, U-9 disappeared! Last known coordinates [%d, %d]!%n", rowSub, colSub);
                    break;
                }
            } else if (newPosition.equals("C")) {
                matrix[rowSub][colSub] = "S";
                countCs++;
                if (countCs > 2){
                    System.out.println("Mission accomplished, U-9 has destroyed all battle cruisers of the enemy!");
                    break;
                }
            }
            command = scanner.nextLine();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
