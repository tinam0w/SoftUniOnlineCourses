package MethodsExersice;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol1 = scanner.nextLine().charAt(0);
        char symbol2 = scanner.nextLine().charAt(0);

        printChar(symbol1, symbol2);
    }

    public static void printChar(char a, char b) {
        if (a < b) {
            for (int i = a + 1; i < b; i++) {
                System.out.print((char) i + " ");
            }
        } else {
            for (int i = b + 1; i < a; i++) {
                System.out.print((char) i + " ");
            }
        }
    }
}
