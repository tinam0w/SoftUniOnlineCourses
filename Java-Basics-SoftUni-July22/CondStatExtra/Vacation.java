package CondStatExtra;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if (budget <= 1000) {
            if (season.equals("Summer")) {
                System.out.print("Alaska - ");
                budget = budget * 0.65;
            } else if (season.equals("Winter")) {
                System.out.print("Morocco - ");
                budget = budget * 0.45;
            }
            System.out.print("Camp - ");
        } else if (budget > 1000 && budget <= 3000) {
            if (season.equals("Summer")) {
                System.out.print("Alaska - ");
                budget = budget * 0.8;
            } else if (season.equals("Winter")) {
                System.out.print("Morocco - ");
                budget = budget * 0.6;
            }
            System.out.print("Hut - ");
        } else if (budget > 3000) {

            budget = budget * 0.9;
            if (season.equals("Summer")) {
                System.out.print("Alaska - ");
            } else if (season.equals("Winter")) {
                System.out.print("Morocco - ");
            }
            System.out.print("Hotel - ");
        }

        System.out.printf("%.2f", budget);
    }}
