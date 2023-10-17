package PBExamsAugust2022;

import java.util.Scanner;

public class ChristmasGifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int toys = 0;
        int sweaters = 0;

        String input = scanner.nextLine();
        while (!input.equals("Christmas")){
            int age = Integer.parseInt(input);
            if (age <= 16)
                toys++;
            else
                sweaters++;
            input = scanner.nextLine();
        }
        int totalToys = toys * 5;
        int totalSweaters = sweaters * 15;

        System.out.printf("Number of adults: %d%n" +
                "Number of kids: %d%n" +
                "Money for toys: %d%n" +
                "Money for sweaters: %d", sweaters, toys, totalToys, totalSweaters);
    }
}
