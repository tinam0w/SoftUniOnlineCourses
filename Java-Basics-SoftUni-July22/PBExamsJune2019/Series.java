package PBExamsJune2019;

import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double total = 0;

        for (int i = 1; i <= n ; i++) {
            String serial = scanner.nextLine();
            double price = Double.parseDouble(scanner.nextLine());
            switch (serial){
                case "Thrones":
                    total = total + (price * 0.5);
                    break;
                case "Lucifer":
                    total = total + (price * 0.6);
                    break;
                case "Protector":
                    total = total + (price * 0.7);
                    break;
                case "TotalDrama":
                    total = total + (price * 0.8);
                    break;
                case "Area":
                    total = total + (price * 0.9);
                    break;
                default:
                    total = total + price;
                    break;
            }
        }
        if (budget >= total)
            System.out.printf("You bought all the series and left with %.2f lv.", budget-total);
        else
            System.out.printf("You need %.2f lv. more to buy the series!", total-budget);
    }
}
