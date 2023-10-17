package PBExamsApril2019;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        double entry = Double.parseDouble(scanner.nextLine());
        double chair = Double.parseDouble(scanner.nextLine());
        double umbrella = Double.parseDouble(scanner.nextLine());
        double total = 0;

        total = (people*entry) + (Math.ceil(people*0.5)*umbrella) + (Math.ceil(people*0.75)*chair);
        System.out.printf("%.2f lv.", total);

    }
}
