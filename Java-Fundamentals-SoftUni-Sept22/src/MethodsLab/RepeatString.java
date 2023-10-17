package MethodsLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());

        System.out.println(concatenateStrings(input, count));
    }

    public static String concatenateStrings(String input, int times) {
        String result = "";
        for (int i = 1; i <= times ; i++) {
            result += input;
        }
        return result;
    }
}
