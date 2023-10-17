package PBExamsApril2019;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double stat = rent - (rent * 0.3);
        double ket = stat - (stat * 0.15);
        double ozv = ket / 2;

        double res = rent + stat + ket + ozv;
        System.out.printf("%.2f", res);

    }
}
