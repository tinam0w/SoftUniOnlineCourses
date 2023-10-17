package April_2022;

import java.util.Scanner;

public class armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String[][] matrix = new String[n][];
        int row = -1, col = -1;

        for (int i = 0; i < n; i++) {
            matrix[i] = scanner.nextLine().split("");
            for (int j = 0; j < n; j++) {
                if (matrix[i][j].equals("A")){
                    matrix[i][j] = "-";
                    row = i;
                    col = j;
                }
            }
        }

        int swords = 0;
        boolean isHeOut = false;
        while (true){
            String command = scanner.nextLine();

            switch (command){
                case "up": row--; break;
                case "down": row++; break;
                case "left": col--; break;
                case "right": col++; break;
            }

            if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[row].length){
                isHeOut = true;
                break;
            }

            if (matrix[row][col].equals("M")){
                matrix[row][col] = "-";
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (matrix[i][j].equals("M")){
                            matrix[i][j] = "-";
                            row = i;
                            col = j;
                        }
                    }
                }
            } else if (!matrix[row][col].equals("-")) {
                int sword = Integer.parseInt(matrix[row][col]);
                swords += sword;
                matrix[row][col] = "-";
                if (swords >= 65){
                    matrix[row][col] = "A";
                    break;
                }
            }
        }

        if (isHeOut){
            System.out.println("I do not need more swords!");
        } else {
            System.out.println("Very nice swords, I will come back for more!");
        }

        System.out.println("The king paid " + swords + " gold coins.");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
