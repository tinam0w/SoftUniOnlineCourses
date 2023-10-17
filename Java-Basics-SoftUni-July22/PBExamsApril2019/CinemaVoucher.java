package PBExamsApril2019;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());
        int price = 0;
        int sum = 0;
        int countTickets = 0;
        int countOther = 0;

        String input = scanner.nextLine();
        while (!input.equals("End")) {

            if (input.length() >= 8) {
                price = input.charAt(0) + input.charAt(1);
                sum = sum + price;
                if (sum >= voucher) break;
                countTickets = countTickets + 1;
            } else {
                price = input.charAt(0);
                sum = sum + price;
                if (sum >= voucher) break;
                countOther = countOther + 1;
            }

            input = scanner.nextLine();
        }

            System.out.println(countTickets);
            System.out.print(countOther);
    }
}
