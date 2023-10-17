package PBExamsAugust2022;

import java.util.Scanner;

public class Moon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double avSpeed = Double.parseDouble(scanner.nextLine());
        double fuel100km = Double.parseDouble(scanner.nextLine());
        double allTime = Math.ceil(((384400 / avSpeed) * 2) + 3);
        System.out.printf("%.0f%n", allTime);
        double usedFuel = ((384400 * fuel100km) / 100) * 2;
        System.out.printf("%.0f", usedFuel);
    }
}
