package WorkingWithAbstractionsExercise.JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] galaxyMatrix = processMatrix(scanner);

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediCoordsArr = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            Coords jediCoords = new Coords(jediCoordsArr[0], jediCoordsArr[1]);

            int[] evilCoordsArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Coords evilCoords = new Coords(evilCoordsArr[0], evilCoordsArr[1]);

            moveEvilAndDestroyStars(galaxyMatrix, evilCoords);
            sum += moveJediAndAddStars(galaxyMatrix, jediCoords);

            command = scanner.nextLine();
        }

        System.out.println(sum);
    }

    private static long moveJediAndAddStars(int[][] galaxyMatrix, Coords jediCoords) {
        long sum = 0;
        while (canJediMove(galaxyMatrix, jediCoords)) {
            if (isInGalaxyMatrix(galaxyMatrix, jediCoords)) {
                sum += galaxyMatrix[jediCoords.row][jediCoords.col];
            }
            jediCoords.row--;
            jediCoords.col++;
        }
        return sum;
    }

    private static boolean canJediMove(int[][] galaxyMatrix, Coords coords) {
        return coords.row >= 0 && coords.col < galaxyMatrix[1].length;
    }

    private static void moveEvilAndDestroyStars(int[][] galaxyMatrix, Coords evilCoords) {
        while (canEvilMove(evilCoords)) {
            if (isInGalaxyMatrix(galaxyMatrix, evilCoords)) {
                galaxyMatrix[evilCoords.row][evilCoords.col] = 0;
            }
            evilCoords.row--;
            evilCoords.col--;
        }
    }

    private static boolean isInGalaxyMatrix(int[][] galaxyMatrix, Coords coords) {
        int galaxyMatrixColumnLength = galaxyMatrix[0].length;
        return coords.row >= 0 && coords.row < galaxyMatrix.length
                && coords.col >= 0 && coords.col < galaxyMatrixColumnLength;
    }

    private static boolean canEvilMove(Coords coords) {
        return coords.row >= 0 && coords.col >= 0;
    }

    private static int[][] processMatrix(Scanner scanner) {
        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = dimensions[0];
        int y = dimensions[1];

        int[][] matrix = new int[x][y];

        int value = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                matrix[i][j] = value++;
            }
        }
        return matrix;
    }

}
