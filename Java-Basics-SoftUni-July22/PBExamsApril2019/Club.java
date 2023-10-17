package PBExamsApril2019;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double target = Double.parseDouble(scanner.nextLine());
        double order = 0;
        double total = 0;
        boolean check = false;

        String cocktail = scanner.nextLine();
        while (!cocktail.equals("Party!")) {
            double n = Double.parseDouble(scanner.nextLine());
            order = n * cocktail.length();

            if (order % 2 != 0)
                order = order * 0.75;

            total = total + order;

            if (total >= target) {
                check = true;
                break;
            }
            cocktail = scanner.nextLine();
        }

        if (check)
            System.out.println("Target acquired.");
        else
            System.out.printf("We need %.2f leva more.%n", target - total);

        System.out.printf("Club income - %.2f leva.", total);
    }
}
