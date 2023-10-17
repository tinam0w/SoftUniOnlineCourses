package PBExamsJuly2020;

import java.util.Scanner;

public class Addbags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceOver20 = Double.parseDouble(scanner.nextLine());
        double kgCase = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int cases = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        if (kgCase < 10) totalPrice = priceOver20 * 0.2;
        else if (kgCase >= 10 && kgCase <= 20) totalPrice = priceOver20 * 0.5;
        else totalPrice = priceOver20;

        if (days > 30) totalPrice = totalPrice * 1.1;
        else if (days >= 7 && days <= 30) totalPrice = totalPrice * 1.15;
        else if (days < 7) totalPrice = totalPrice * 1.4;

        System.out.printf("The total price of bags is: %.2f lv.", totalPrice * cases);

    }
}
