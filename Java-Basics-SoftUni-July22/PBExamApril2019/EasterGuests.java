package PBExamApril2019;

import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double total = (Math.ceil(people*1.0 / 3) * 4) + (people * 2 * 0.45);

        if (total <= budget){
            System.out.printf("Lyubo bought %.0f Easter bread and %d eggs.%n",Math.ceil(people*1.0 / 3), people * 2 );
            System.out.printf("He has %.2f lv. left.", budget-total);
        } else {
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", total-budget);
        }
    }
}
