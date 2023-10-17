package PBExamMay2019;

import java.util.Scanner;

public class Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();
        double total = 0;

        if (day.equals("Saturday"))
            total = (100 + fuel*2.1) * 0.9;
        else if (day.equals("Sunday"))
            total = (100 + fuel*2.1) * 0.8;

        if (total <= budget)
            System.out.printf("Safari time! Money left: %.2f lv.", budget-total);
        else
            System.out.printf("Not enough money! Money needed: %.2f lv.",total - budget);
    }
}
