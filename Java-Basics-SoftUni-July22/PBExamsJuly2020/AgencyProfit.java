package PBExamsJuly2020;

import java.util.Scanner;

public class AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String company = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int kidsTickets = Integer.parseInt(scanner.nextLine());
        double adultPrice = Double.parseDouble(scanner.nextLine());
        double servicePrice = Double.parseDouble(scanner.nextLine());
        double kidsPrice = adultPrice * 0.3 + servicePrice;
        adultPrice = adultPrice + servicePrice;

        double total = adultTickets*adultPrice + kidsTickets*kidsPrice;
        total = total * 0.2;
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", company, total);
    }
}
