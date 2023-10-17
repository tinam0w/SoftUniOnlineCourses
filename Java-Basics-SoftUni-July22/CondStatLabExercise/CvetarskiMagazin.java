package CondStatLabExercise;

import java.util.Scanner;

public class CvetarskiMagazin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double magn = Double.parseDouble(scanner.nextLine());
        double zium = Double.parseDouble(scanner.nextLine());
        double rozi = Double.parseDouble(scanner.nextLine());
        double kakt = Double.parseDouble(scanner.nextLine());
        double gift = Double.parseDouble(scanner.nextLine());

        double total = magn*3.25 + zium*4 + rozi*3.5 + kakt*8;
        double pechalba = total - total*0.05;
        double ost = Math.abs(gift-pechalba);
        if (pechalba>=gift) {
            double a = Math.floor(ost);
            System.out.printf("She is left with %.0f leva.", a);
        }
        else {
            double a = Math.ceil(ost);
            System.out.printf("She will have to borrow %.0f leva.",a);
        }

    }
}
