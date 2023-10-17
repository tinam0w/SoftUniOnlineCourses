package MethodsExersice;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            if (isDiv8(i) && isOddIn(i))
                System.out.println(i);
        }

    }

    public static boolean isDiv8(int num) {
        int current = num;
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            int digit = current % 10;
            sum += digit;
            current = current / 10;
        }

        if (sum % 8 == 0)
            return true;
        else
            return false;
    }

    public static boolean isOddIn(int num) {
        int current = num;
        boolean isOdd = false;
        for (int i = 1; i <= num; i++) {
            int digit = current % 10;
            if (current % 2 != 0) {
                isOdd = true;
                break;
            }
            current = current / 10;
        }
        if (isOdd)
            return true;
        else
            return false;
    }
}
