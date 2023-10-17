package PBExamMay2019;

import java.util.Scanner;

public class TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int count = 1;
        double total = 0;
        boolean check = false;

        String product = scanner.nextLine();
        while (!product.equals("Stop")) {
            double price = Double.parseDouble(scanner.nextLine());
            if (count % 3 == 0) price = price * 0.5;
            total = total + price;
            if (total <= budget) {
                count++;
            } else {
                check = true;
                break;
            }
            product = scanner.nextLine();
        }

        if (check) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", total-budget);
        } else
            System.out.printf("You bought %d products for %.2f leva.", count-1, total);
    }
}