package CondStatExtra;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 100) {
            System.out.println("Economy class");
            if (season.equals("Summer")) {
                budget = budget * 0.35;
                System.out.print("Cabrio - ");
            } else if (season.equals("Winter")) {
                budget = budget * 0.65;
                System.out.print("Jeep - ");
            }
        } else if (budget > 100 && budget <= 500) {
            System.out.println("Compact class");
            if (season.equals("Summer")) {
                budget = budget * 0.45;
                System.out.print("Cabrio - ");
            } else if (season.equals("Winter")) {
                budget = budget * 0.8;
                System.out.print("Jeep - ");
            }
        } else if (budget > 500) {
            System.out.println("Luxury class");
            budget = budget * 0.9;
            System.out.print("Jeep - ");
        }

        System.out.printf("%.2f",budget);
    }

    }

