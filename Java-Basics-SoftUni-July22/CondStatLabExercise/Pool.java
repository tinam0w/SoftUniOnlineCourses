package CondStatLabExercise;

import java.util.Scanner;

public class Pool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double waterFull = (p1 * h) + (p2 * h);
        if (waterFull > v)
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.",h,waterFull - v);
        else {
            double b = (waterFull / v) * 100;
            double c = ((p1 * h) / waterFull) * 100;
            double d = ((p2 * h) / waterFull) * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%.",b,c,d);
        }

    }
}
