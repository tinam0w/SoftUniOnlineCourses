package CondStatLabExercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double videok = Double.parseDouble(scanner.nextLine());
        double pros = Double.parseDouble(scanner.nextLine());
        double ram = Double.parseDouble(scanner.nextLine());

        double total = (videok*250) + (pros*videok*0.35*250) + (ram*videok*0.1*250);

        if (videok>pros) total=total*0.85;

        if (total<=budget)
            System.out.printf("You have %.2f leva left!",(budget-total));
        else
            System.out.printf("Not enough money! You need %.2f leva more!",(total-budget));
    }
}
