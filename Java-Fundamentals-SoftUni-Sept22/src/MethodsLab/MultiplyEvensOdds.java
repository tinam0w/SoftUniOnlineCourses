package MethodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        System.out.println(multiplyOddEvenSums(number));
    }

    public static int multiplyOddEvenSums(int num) {
        if (num < 0)
            num = Math.abs(num);
        int sumOdd = sumOddDigits(num);
        int sumEven = sumEvenDigits(num);
        return sumEven * sumOdd;
    }

    private static int sumOddDigits(int num) {
        int current = num;
        int sumOdd = 0;
        while (current > 0) {
            int digit = current % 10;
            if (digit % 2 != 0)
                sumOdd += digit;
            current = current / 10;
        }
            return sumOdd;
    }

    private static int sumEvenDigits(int num) {
        int current = num;
        int sumEven = 0;
        while (current > 0) {
            int digit = current % 10;
            if (digit % 2 == 0)
                sumEven += digit;
            current = current / 10;
        }
            return sumEven;
    }
}
