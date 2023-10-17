package FundamentalsBasicsExercise;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 1; i <= n ; i++) {
            double price = Double.parseDouble(scanner.nextLine());
            int day = Integer.parseInt(scanner.nextLine());
            int qnty = Integer.parseInt(scanner.nextLine());
            double sum = ((day * qnty) * price);
            total += sum;
            System.out.printf("The price for the coffee is: $%.2f%n", sum);
        }
        System.out.printf("Total: $%.2f%n", total);
    }
}
