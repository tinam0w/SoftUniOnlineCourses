package PBExamApril2019;

import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bread = Double.parseDouble(scanner.nextLine());
        double eggs = Double.parseDouble(scanner.nextLine());
        double cookies = Double.parseDouble(scanner.nextLine());

        bread = bread * 3.2;
        eggs = (eggs * 4.35) + (eggs * 12 * 0.15);
        cookies = cookies * 5.4;
        double total = bread + eggs + cookies;

        System.out.printf("%.2f", total);
    }
}
