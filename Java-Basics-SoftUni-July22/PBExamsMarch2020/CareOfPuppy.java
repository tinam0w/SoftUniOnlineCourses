package PBExamsMarch2020;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allFood = Integer.parseInt(scanner.nextLine());
        allFood = allFood * 1000;
        int totalEaten = 0;

        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            int eatenFood = Integer.parseInt(input);
            totalEaten += eatenFood;
            input = scanner.nextLine();
        }
        if (totalEaten <= allFood)
            System.out.printf("Food is enough! Leftovers: %d grams.", allFood-totalEaten);
        else
            System.out.printf("Food is not enough. You need %d grams more.", totalEaten-allFood);
    }
}
