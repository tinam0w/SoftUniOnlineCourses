package PBExamApril2019;

import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        if (people >= 10 && people <= 15) price = price * 0.85;
        else if (people > 15 && people <= 20) price = price * 0.8;
        else if (people > 20) price = price * 0.75;

        double total = (price * people) + (budget * 0.1);

        if (total <= budget)
            System.out.printf("It is party time! %.2f leva left.", budget-total);
        else
            System.out.printf("No party! %.2f leva needed.", total - budget);
    }
}
