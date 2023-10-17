package CondStatAdvancedExercise;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishmen = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (season.equals("Spring"))
            price = 3000;
        else if (season.equals("Summer") || season.equals("Autumn"))
            price = 4200;
        else if (season.equals("Winter"))
            price = 2600;

        if (fishmen<=6)
            price=price*0.9;
        else if (fishmen>6 && fishmen<=11)
            price=price*0.85;
        else if (fishmen>11)
            price=price*0.75;

        if ((fishmen % 2 == 0) && (season.equals("Summer")
        || season.equals("Winter") || season.equals("Spring")))
            price=price*0.95;

        if (price<=budget)
            System.out.printf("Yes! You have %.2f leva left.", budget-price);
        else
            System.out.printf("Not enough money! You need %.2f leva.",price-budget);

    }
}
