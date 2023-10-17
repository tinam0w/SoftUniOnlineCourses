package PBExamsApril2019;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bud = Double.parseDouble(scanner.nextLine());
        double stat = Double.parseDouble(scanner.nextLine());
        double obl = Double.parseDouble(scanner.nextLine());
        double oblT = 0;
        double dek = bud*0.1;
        if (stat>150) {
            oblT = obl*stat*0.9;
        } else {
            oblT=obl*stat;
        }

        if ((oblT+dek)>bud) {
            double res = Math.abs(bud - (oblT+dek));
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", res);
        } else {
            double res = bud-(oblT+dek);
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", res);
        }

    }
}
