package PBExamsMarch2020;

import java.util.Scanner;

public class FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String pol = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double total = 0;
        switch (sport){
            case "Gym":
                if (pol.equals("m"))
                    total = 42;
                if (pol.equals("f"))
                    total = 35;
                break;
            case "Boxing":
                if (pol.equals("m"))
                    total = 41;
                if (pol.equals("f"))
                    total = 37;
                break;
            case "Yoga":
                if (pol.equals("m"))
                    total = 45;
                if (pol.equals("f"))
                    total = 42;
                break;
            case "Zumba":
                if (pol.equals("m"))
                    total = 34;
                if (pol.equals("f"))
                    total = 31;
                break;
            case "Dances":
                if (pol.equals("m"))
                    total = 51;
                if (pol.equals("f"))
                    total = 53;
                break;
            case "Pilates":
                if (pol.equals("m"))
                    total = 39;
                if (pol.equals("f"))
                    total = 37;
                break;
        }
        if (age <= 19) total = total * 0.8;
        if (total <= budget)
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        else
            System.out.printf("You don't have enough money! You need $%.2f more.", total-budget);
    }
}
