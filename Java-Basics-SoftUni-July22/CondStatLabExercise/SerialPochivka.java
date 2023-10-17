package CondStatLabExercise;

import java.util.Scanner;

public class SerialPochivka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String serial = scanner.nextLine();;
        int epizod = Integer.parseInt(scanner.nextLine());
        int pochivka = Integer.parseInt(scanner.nextLine());
        double lunch = pochivka/8.0;
        double otdih = pochivka/4.0;
        double left = pochivka-lunch-otdih;

        if (left>=epizod) {
            double a = Math.ceil(left-epizod);
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.",serial,a);
        }
        else {
            double a = Math.ceil(epizod-left);
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", serial,a);
        }

    }
}
