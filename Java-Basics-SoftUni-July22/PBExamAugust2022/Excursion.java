package PBExamAugust2022;

import java.util.Scanner;

public class Excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double cards = Double.parseDouble(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());

        nights = 20 * nights;
        cards = 1.6 * cards;
        tickets = 6 * tickets;
        double total = (nights + cards + tickets) * people;
        total = total * 1.25;

        System.out.printf("%.2f", total);

    }
}
