package PBExamApril2019;

import java.util.Scanner;

public class EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double maxSugar = 0;
        double maxFlour = 0;
        double allSugar = 0;
        double allFlour = 0;

        int breads = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= breads ; i++) {
            double sugar = Double.parseDouble(scanner.nextLine());
            double flour = Double.parseDouble(scanner.nextLine());
            if (sugar > maxSugar) maxSugar = sugar;
            if (flour > maxFlour) maxFlour = flour;
            allSugar += sugar;
            allFlour += flour;
        }
        allSugar = Math.ceil(allSugar/950);
        allFlour = Math.ceil(allFlour/750);
        System.out.printf("Sugar: %.0f%n" +
                "Flour: %.0f%n" +
                "Max used flour is %.0f grams, max used sugar is %.0f grams.", allSugar, allFlour, maxFlour, maxSugar);

    }
}
