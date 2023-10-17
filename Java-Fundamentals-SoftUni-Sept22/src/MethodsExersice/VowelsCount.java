package MethodsExersice;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        printVowels(input.toLowerCase());
    }

    public static void printVowels(String input) {
        int count= 0;

        for (char symbol : input.toCharArray()) {
            if (symbol == 'a' || symbol == 'e' || symbol == 'i'
                    || symbol == 'o' || symbol == 'u')
                count++;
        }
        System.out.println(count);
    }
}
