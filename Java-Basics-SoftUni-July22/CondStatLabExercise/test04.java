package CondStatLabExercise;

import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double wRows = Math.floor(w * 100 / 120);
        double hRows = Math.floor((h * 100-100) / 70);
        double rows = (wRows*hRows)-3;

        if (w>=3 && w<=100) {
            if (h >= 3 && h <= 100) {
                System.out.printf("%.0f", rows);
            }
        }
    }
}
