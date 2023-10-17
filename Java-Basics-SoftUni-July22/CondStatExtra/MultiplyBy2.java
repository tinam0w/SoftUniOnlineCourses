package CondStatExtra;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.next());
        while (a>=0) {
            System.out.printf("Result: %.2f%n",a*2);
            a = Double.parseDouble(scanner.next());
        }
        System.out.println("Negative number!");
    }
}
