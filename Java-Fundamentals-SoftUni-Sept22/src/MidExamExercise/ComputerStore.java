package MidExamExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        double totalVAt = 0;
        double totalNoVAT = 0;
        double VAT = 0;
        while (!(input.equals("special") || input.equals("regular"))) {
            double price = Double.parseDouble(input);
            if (price >= 0) {
                totalNoVAT += price;
                double priceVAT = price * 1.2;
                VAT += (priceVAT - price);
                totalVAt += priceVAT;
            } else {
                System.out.println("Invalid price!");
            }
            input = scanner.nextLine();
        }
        if (totalVAt == 0) {
            System.out.println("Invalid order!");
        } else {
            if (input.equals("special")) {
                totalVAt = totalVAt * 0.9;
            }
            System.out.printf("Congratulations you've just bought a new computer!%n" +
                    "Price without taxes: %.2f$%n" +
                    "Taxes: %.2f$%n" +
                    "-----------%n" +
                    "Total price: %.2f$%n", totalNoVAT, VAT, totalVAt);
        }
    }
}
