package PBExamsAugust2022;

import java.util.Scanner;

public class ANDProcessors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int target = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        double produced = Math.floor(days * ((employees * 8.0) / 3));
        double profit = produced * 110.10;
        double expect = target * 110.10;

        if (profit >= expect)
            System.out.printf("Profit: -> %.2f BGN", profit - expect);
        else
            System.out.printf("Losses: -> %.2f BGN", expect - profit);
    }
}
