package PBExamsMarch2020;

import java.util.Scanner;

public class FoodForPets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double allFood = Double.parseDouble(scanner.nextLine());
        double biscuits = 0;
        double dogTotal = 0;
        double catTotal = 0;

        for (int i = 1; i <= days ; i++) {
            int dogEaten = Integer.parseInt(scanner.nextLine());
            int catEaten = Integer.parseInt(scanner.nextLine());
            if (i % 3 == 0)
                biscuits += (dogEaten + catEaten) * 0.1;
            dogTotal += dogEaten;
            catTotal += catEaten;
        }

        double dog = (dogTotal / (dogTotal + catTotal)) * 100;
        double cat = (catTotal / (dogTotal + catTotal)) * 100;
        double all = ((dogTotal+catTotal) / allFood) * 100;
        System.out.printf("Total eaten biscuits: %dgr.%n", Math.round(biscuits));
        System.out.printf("%.2f%% of the food has been eaten.%n", all);
        System.out.printf("%.2f%% eaten from the dog.%n", dog);
        System.out.printf("%.2f%% eaten from the cat.%n", cat);
    }
}
