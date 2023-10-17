package JavaAdvanced.ExamProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class treasureHunt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] dimensions = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(dimensions[0]);
        int cols = Integer.parseInt(dimensions[1]);
        String[][] matrix = new String[rows][cols];
        List<String> commandsList = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split("\\s+");
        }

        int[] myPosition = findMe(matrix);
        int myRow = myPosition[0];
        int myCol = myPosition[1];

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {

            if (command.equals("up")) {
                myRow--;
            } else if (command.equals("down")) {
                myRow++;
            } else if (command.equals("left")) {
                myCol--;
            } else if (command.equals("right")) {
                myCol++;
            }
            if (isValid(myRow, myCol, matrix)) {
                String newPosition = matrix[myRow][myCol];
                if (newPosition.equals("T")) {
                    myRow = myPosition[0];
                    myCol = myPosition[1];
                } else {
                    myPosition[0] = myRow;
                    myPosition[1] = myCol;
                    commandsList.add(command);
                }
            } else {
                myRow = myPosition[0];
                myCol = myPosition[1];
            }
            command = scanner.nextLine();
        }

        int row = myPosition[0];
        int col = myPosition[1];
        if (matrix[row][col].equals("X")) {
            System.out.println("I've found the treasure!");
            System.out.print("The right path is ");
            System.out.println(String.join(", ", commandsList));
        } else {
            System.out.println("The map is fake!");
        }
    }

    private static boolean isValid(int myRow, int myCol, String[][] matrix) {
        return myRow >= 0 && myRow < matrix.length &&
                myCol >= 0 && myCol < matrix[myRow].length;
    }

    private static int[] findMe(String[][] matrix) {
        int[] position = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("Y")) {
                    position[0] = i;
                    position[1] = j;
                }
            }
        }
        return position;
    }
}
