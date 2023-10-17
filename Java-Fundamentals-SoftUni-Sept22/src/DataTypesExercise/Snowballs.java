package DataTypesExercise;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allBalls = Integer.parseInt(scanner.nextLine());
        double topValue = Double.MIN_VALUE;
        int topSnow = 0;
        int topTime = 0;
        int topQuality = 0;
        for (int i = 1; i <= allBalls ; i++) {
            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());
            double value = Math.pow((snow / (time * 1.0)) , quality);
            if (value > topValue) {
                topValue = value;
                topQuality = quality;
                topSnow = snow;
                topTime = time;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)", topSnow, topTime, topValue, topQuality);
    }
}
