package PBExamMay2019;

import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pStrawberries = Double.parseDouble(scanner.nextLine());
        double qBananas = Double.parseDouble(scanner.nextLine());
        double qOranges = Double.parseDouble(scanner.nextLine());
        double qRaspberries = Double.parseDouble(scanner.nextLine());
        double qStawberries = Double.parseDouble(scanner.nextLine());

        double total = 0;
        double pBananas = (pStrawberries * 0.5) * 0.2;
        double pOranges = (pStrawberries * 0.5) * 0.6;
        double pRaspberries = pStrawberries * 0.5;

        total = qStawberries * pStrawberries + qBananas * pBananas + qOranges * pOranges + qRaspberries * pRaspberries;
        System.out.printf("%.2f", total);

    }
}
