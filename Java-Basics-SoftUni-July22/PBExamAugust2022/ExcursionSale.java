package PBExamAugust2022;

import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sea = Integer.parseInt(scanner.nextLine());
        int mountain = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int countSea = 0;
        int countMountain = 0;
        boolean isSold = false;
        String type = scanner.nextLine();
        while (!type.equals("Stop")){
            if (type.equals("sea")){
                countSea++;
                if (countSea <= sea)
                    total += 680;
            } else if (type.equals("mountain")) {
                countMountain++;
                if (countMountain <= mountain)
                    total += 499;
            }
            if (countMountain >= mountain && countSea >= sea) {
                isSold = true;
                break;
            }
            type = scanner.nextLine();
        }

        if (isSold) {
            System.out.println("Good job! Everything is sold.");
            System.out.printf("Profit: %d leva.", total);
        } else
            System.out.printf("Profit: %d leva.", total);
    }
}
