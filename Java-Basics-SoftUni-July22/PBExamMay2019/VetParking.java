package PBExamMay2019;

import java.util.Scanner;

public class VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        double dayTotal = 0;

        double days = Double.parseDouble(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());
        for (int i = 1; i <= days ; i++) {
            for (int j = 1; j <= hours ; j++) {
                if (i % 2 == 0 && j % 2 != 0) dayTotal = dayTotal + 2.5;
                else if (i % 2 != 0 && j % 2 == 0) dayTotal = dayTotal + 1.25;
                else dayTotal = dayTotal + 1;
            }
            System.out.printf("Day: %d - %.2f leva%n", i, dayTotal );
            total = total + dayTotal;
            dayTotal = 0;
        }

        System.out.printf("Total: %.2f leva", total);
    }
}
