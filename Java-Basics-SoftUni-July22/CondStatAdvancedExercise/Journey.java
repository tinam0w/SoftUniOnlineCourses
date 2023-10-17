package CondStatAdvancedExercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine(); // summer winter
        String location = ""; // Bulgaria Balkans Europe
        String place = ""; // Camp Hotel
        double total = 0;

        if (budget<=100 && season.equals("summer")) {
            location = "Bulgaria";
            total = budget * 0.3;
            place = "Camp";
        } else if (budget<=100 && season.equals("winter")) {
            location = "Bulgaria";
            total = budget * 0.7;
            place = "Hotel";
        } else if ((budget>100 && budget<=1000) && season.equals("summer")){
            location = "Balkans";
            total = budget * 0.4;
            place = "Camp";
        } else if ((budget>100 && budget<=1000) && season.equals("winter")){
            location = "Balkans";
            total = budget * 0.8;
            place = "Hotel";
        } else if (budget>1000) {
            location = "Europe";
            total = budget*0.9;
            place = "Hotel";
        }

        System.out.printf("Somewhere in %s%n%s - %.2f",location,place,total);

    }
}
