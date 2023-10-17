package PBExamAugust2022;

import java.util.Scanner;

public class braceletStand {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketMoney = Double.parseDouble(scanner.nextLine());
        double salesMoney = Double.parseDouble(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());
        double totalMoney = 0;

        pocketMoney = pocketMoney * 5;
        salesMoney = salesMoney * 5;
        totalMoney = pocketMoney + salesMoney - expenses;

        if (totalMoney >= giftPrice)
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", totalMoney);
        else
            System.out.printf("Insufficient money: %.2f BGN.", giftPrice - totalMoney);
    }
}
