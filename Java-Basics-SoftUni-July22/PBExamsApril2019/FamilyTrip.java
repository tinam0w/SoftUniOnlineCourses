package PBExamsApril2019;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int other = Integer.parseInt(scanner.nextLine());
        double total = 0;

        if (nights > 7)
            total = nights*(price*0.95) + budget*(other*1.0/100);
        else
            total = nights*price + budget*(other*1.0/100);

        if (total <= budget)
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget-total);
        else
            System.out.printf("%.2f leva needed.", total - budget);
    }
}
