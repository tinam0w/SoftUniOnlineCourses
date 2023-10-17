package PBExamApril2019;

import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = Integer.parseInt(scanner.nextLine());
        int sold = 0;
        boolean check = false;

        String input = scanner.nextLine();
        while (!input.equals("Close")) {
            int eggs = Integer.parseInt(scanner.nextLine());
            if (input.equals("Buy")) {
                total = total - eggs;
                sold = sold + eggs;
            }
            if (input.equals("Fill"))
                total = total + eggs;
            if (total < 0) {
                total = total + eggs;
                check = true;
                break;
            } else if (total == 0) {
                check = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (check) {
            System.out.println("Not enough eggs in store!");
            System.out.printf("You can buy only %d.", total);
        } else {
            System.out.println("Store is closed!");
            System.out.printf("%d eggs sold.", sold);
        }
    }
}
