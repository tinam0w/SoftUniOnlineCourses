package MethodsExersice;

import java.util.Scanner;

public class AddSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int number3 = Integer.parseInt(scanner.nextLine());

        int sum = sumNumbers(number1, number2);
        int result = subtractNumbers(sum, number3);
        System.out.println(result);
    }

    public static int sumNumbers(int a, int b) {
        return a + b;
    }

    public static int subtractNumbers(int a, int b){
        return a - b;
    }
}
