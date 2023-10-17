package JavaAdvanced.ExamPreparation_01;

import java.util.Scanner;

public class Snake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        char[][] field = new char[n][n];
        int snakeRow = -1, snakeCol = -1;
        int lairFirstRow = -1, lairFirstCol = -1, lairSecondRow = -1, lairSecondCol = -1;

        for (int i = 0; i < field.length; i++) {
            String row = scanner.nextLine();
            field[i] = row.toCharArray();

            //find snake:
            int snakeColumn = row.indexOf('S');
            if (snakeColumn > -1){
                snakeRow = i;
                snakeCol = snakeColumn;
            }

            //find tunnel:
            for (int j = 0; j < n; j++) {
                if (field[i][j] == 'B'){
                    if (lairFirstRow == -1){
                        lairFirstRow = i;
                        lairFirstCol = j;
                    } else {
                        lairSecondRow = i;
                        lairSecondCol = j;
                    }
                }
            }

        }

        int foodEaten = 0;
        while (foodEaten < 10){
            String command = scanner.nextLine();

            field[snakeRow][snakeCol] = '.';
            switch (command){
                case "left": snakeCol--; break;
                case "right": snakeCol++; break;
                case "down": snakeRow++; break;
                case "up": snakeRow--; break;
            }

            if (snakeRow < 0 || snakeRow >= n ||
                    snakeCol < 0 || snakeCol >= n){
                break;
            }

            if (field[snakeRow][snakeCol] == '*'){
                foodEaten++;
            }

            //check B:
            if (snakeRow == lairFirstRow && snakeCol == lairFirstCol){
                field[snakeRow][snakeCol] = '.';
                snakeRow = lairSecondRow;
                snakeCol = lairSecondCol;
            } else if (snakeRow == lairSecondRow && snakeCol == lairSecondCol){
                field[snakeRow][snakeCol] = '.';
                snakeRow = lairFirstRow;
                snakeCol = lairFirstCol;
            }

            //mark moved:
            field[snakeRow][snakeCol] = 'S';
        }

        if (foodEaten == 10){
            System.out.println("You won! You fed the snake.");
        } else {
            System.out.println("Game over!");
        }

        System.out.printf("Food eaten: %d\n", foodEaten);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }

    }
}
