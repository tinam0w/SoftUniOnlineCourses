package CondStatExtra;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        double grupa = Double.parseDouble(scanner.nextLine());

        double total = 0.0;

        if (grupa>=1 && grupa<=4) budget=budget*0.25;
        else if (grupa>=5 && grupa<=9) budget=budget*0.4;
        else if (grupa>=10 && grupa<=24) budget=budget*0.5;
        else if (grupa>=25 && grupa<=49) budget=budget*0.6;
        else if (grupa>=50) budget=budget*0.75;

        if (category.equals("VIP")) total=grupa*499.99;
        else if (category.equals("Normal")) total=grupa*249.99;

        if (total<=budget)
            System.out.printf("Yes! You have %.2f leva left.",(budget-total));
        else
            System.out.printf("Not enough money! You need %.2f leva.",(total-budget));


    }
}
