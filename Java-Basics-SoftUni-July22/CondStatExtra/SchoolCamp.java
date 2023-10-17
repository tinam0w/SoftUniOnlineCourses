package CondStatExtra;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String group = scanner.nextLine();
        double students = Double.parseDouble(scanner.nextLine());
        double nights = Double.parseDouble(scanner.nextLine());

        double total = 0;

        if (group.equals("boys")) {
            if (season.equals("Winter")) {
                total = students * nights * 9.6;
                System.out.print("Judo");
            }
            if (season.equals("Spring")) {
                total = students * nights * 7.2;
                System.out.print("Tennis");
            }
            if (season.equals("Summer")) {
                total = students * nights * 15;
                System.out.print("Football");
            }
        } else if (group.equals("girls")) {
            if (season.equals("Winter")) {
                total = students * nights * 9.6;
                System.out.print("Gymnastics");
            }
            if (season.equals("Spring")) {
                total = students * nights * 7.2;
                System.out.print("Athletics");
            }
            if (season.equals("Summer")) {
                total = students * nights * 15;
                System.out.print("Volleyball");
            }
        } else if (group.equals("mixed")) {
            if (season.equals("Winter")) {
                total = students * nights * 10;
                System.out.print("Ski");
            }
            if (season.equals("Spring")) {
                total = students * nights * 9.5;
                System.out.print("Cycling");
            }
            if (season.equals("Summer")) {
                total = students * nights * 20;
                System.out.print("Swimming");
            }
        }

        if (students>=50) total=total*0.5;
        if (students>=20 && students<50) total=total*0.85;
        if (students>=10 && students<20) total=total*0.95;

        System.out.printf(" %.2f lv.",total);
    }
}
