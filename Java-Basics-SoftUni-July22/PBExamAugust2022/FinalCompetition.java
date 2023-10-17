package PBExamAugust2022;

import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String country = scanner.nextLine();

        double price = 0;

        if (country.equals("Bulgaria")){
            price = points * dancers;
            if (season.equals("summer")){
                price = price * 0.95;
            } else if (season.equals("winter")) {
                price = price * 0.92;
            }
        } else if (country.equals("Abroad")) {
            price = (points * dancers) * 1.5;
            if (season.equals("summer")){
                price = price * 0.9;
            } else if (season.equals("winter")) {
                price = price * 0.85;
            }
        }

        double donation = price * 0.75;
        double perDancer = (price - donation) / dancers;

        System.out.printf("Charity - %.2f%n", donation);
        System.out.printf("Money per dancer - %.2f", perDancer);

    }
}
