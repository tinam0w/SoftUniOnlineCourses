package MethodsExersice;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printMiddleChar(input);
    }

    public static void printMiddleChar(String in) {
        int index = in.length() / 2;
        if (in.length() % 2 == 0) {
            System.out.print((char) in.charAt(index - 1));
            System.out.print((char) in.charAt(index));
        } else {
            System.out.println((char) in.charAt(index));
        }
    }
}
