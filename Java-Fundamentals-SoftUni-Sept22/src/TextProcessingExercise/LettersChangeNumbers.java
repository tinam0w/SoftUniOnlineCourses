package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] codes = scanner.nextLine().split("\\s+");
        double sum = 0;
        for (String code : codes) {
            double codeNumber = getCodeNumber(code);
            sum += codeNumber;
        }
        System.out.printf("%.2f%n", sum);
    }

    public static double getCodeNumber(String code) {
        char firstLetter = code.charAt(0);
        char lastLetter = code.charAt(code.length() - 1);
        double number = Double.parseDouble(code.replace(firstLetter, ' ').replace(lastLetter, ' ').trim());

        if (Character.isUpperCase(firstLetter)) {
            number /= (int) firstLetter - 64;
        } else {
            number *= (int) firstLetter - 96;
        }

        if (Character.isUpperCase(lastLetter)) {
            number -= (int) lastLetter - 64;
        } else {
            number += (int) lastLetter - 96;
        }

        return number;
    }
}
