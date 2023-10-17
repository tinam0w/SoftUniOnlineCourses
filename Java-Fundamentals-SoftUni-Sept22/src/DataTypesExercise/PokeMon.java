package DataTypesExercise;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        int distanceM = Integer.parseInt(scanner.nextLine());
        int exhaustionY = Integer.parseInt(scanner.nextLine());
        int countPokes = 0;
        int powerN = N;
            while (powerN >= distanceM) {
                powerN -= distanceM;
                countPokes++;
                if (powerN == (N / 2) && exhaustionY > 0) {
                    powerN = powerN / exhaustionY;
                }
            }
        System.out.printf("%d%n%d", powerN, countPokes);
    }
}
