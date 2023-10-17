package DataTypesExercise;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());
        double maxVolume = Double.MIN_VALUE;
        String biggestModel = "";
        for (int i = 1; i <= countKegs ; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());;
            double volume = Math.PI * Math.pow(radius, 2) * height;
            if (volume > maxVolume) {
                maxVolume = volume;
                biggestModel = model;
            }
        }
        System.out.print(biggestModel);
    }
}
