package JavaAdvanced.ExamProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tresureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int rows = Integer.parseInt(input[0]);
        int cols = Integer.parseInt(input[1]);
        String[][] matrix = new String[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextLine().split(" ");
        }

        int[] myTresure = findTheX(matrix);
        List<String> positionsList = new ArrayList<>();
        int[] lastPosition = new int[2];

        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            int[] myCoordinates = findMe(matrix);
            int myRow = myCoordinates[0];
            int myCol = myCoordinates[1];

            switch (command) {
                case "up":
                    myRow--;
                    break;
                case "down":
                    myRow++;
                    break;
                case "left":
                    myCol--;
                    break;
                case "right":
                    myCol++;
                    break;
            }

            if (isItInMatrix(myRow, myCol, matrix)) {
                lastPosition[0] = myRow;
                lastPosition[1] = myCol;
                String newPosition = matrix[myRow][myCol];
                if (newPosition.equals("-")) {
                    matrix[myCoordinates[0]][myCoordinates[1]] = "-";
                    matrix[myRow][myCol] = "Y";
                    positionsList.add(command);
                    if (checkPosition(myRow, myCol, myTresure, positionsList))
                        return;
                } else if (newPosition.equals("T")) {
                    matrix[myCoordinates[0]][myCoordinates[1]] = "Y";
                    lastPosition[0] = myCoordinates[0];
                    lastPosition[1] = myCoordinates[1];
                    if (checkPosition(lastPosition[0], lastPosition[1], myTresure, positionsList))
                        return;
                } else if (newPosition.equals("X")) {
                    matrix[myCoordinates[0]][myCoordinates[1]] = "-";
                    matrix[myRow][myCol] = "Y";
                    positionsList.add(command);
                    if (checkPosition(myRow, myCol, myTresure, positionsList))
                        return;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("The map is fake!");
    }

    private static boolean checkPosition(int row, int col, int[] myTresure, List<String> positionsList) {
        if (row == myTresure[0] && col == myTresure[1]) {
            System.out.println("I've found the treasure!");
            System.out.println("The right path is " + String.join(", ", positionsList));
            return true;
        }
        return false;
    }

    private static int[] findTheX(String[][] matrix) {
        int[] coor = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("X")) {
                    coor[0] = i;
                    coor[1] = j;
                    break;
                }
            }
        }
        return coor;
    }

    private static boolean isItInMatrix(int myRow, int myCol, String[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        return myRow >= 0 && myRow < rows && myCol >= 0 && myCol < cols;
    }

    private static int[] findMe(String[][] matrix) {
        int[] coor = new int[2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j].equals("Y")) {
                    coor[0] = i;
                    coor[1] = j;
                    break;
                }
            }
        }
        return coor;
    }
}
