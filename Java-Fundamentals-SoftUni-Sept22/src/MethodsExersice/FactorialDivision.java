package MethodsExersice;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        double result = fact(num1) * 1.0/ fact(num2);
        System.out.printf("%.2f", result);
    }

    public static long fact(int number){
        long fact = 1;
        for (int i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
