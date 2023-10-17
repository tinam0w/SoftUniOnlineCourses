package PBExamsMarch2020;

import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bitcoins = Double.parseDouble(scanner.nextLine());
        double joans = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        bitcoins = (bitcoins * 1168) / 1.95;
        joans = ((joans * 0.15) * 1.76) / 1.95;
        double total = (bitcoins + joans) * ((100 - commission)/100);
        System.out.printf("%.2f", total);
    }
}
