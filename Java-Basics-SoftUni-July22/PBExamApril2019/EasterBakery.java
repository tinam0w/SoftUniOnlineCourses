package PBExamApril2019;

import java.util.Scanner;

public class EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceFlour = Double.parseDouble(scanner.nextLine());
        double kgFlour = Double.parseDouble(scanner.nextLine());
        double kgSugar = Double.parseDouble(scanner.nextLine());
        double eggs = Double.parseDouble(scanner.nextLine());
        double yeast = Double.parseDouble(scanner.nextLine());

        double priceSugar = priceFlour * 0.75;
        double priceEggs = priceFlour * 1.1;
        double priceYeast = priceSugar * 0.2;

        double total = priceFlour*kgFlour + priceEggs*eggs + priceYeast*yeast + priceSugar*kgSugar;
        System.out.printf("%.2f", total);
    }
}
