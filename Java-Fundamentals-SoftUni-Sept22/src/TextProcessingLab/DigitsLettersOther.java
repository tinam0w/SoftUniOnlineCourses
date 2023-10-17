package TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder numbers = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9'){
               //Character.isDigit(ch);
                numbers.append(ch);
            } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
               //Character.isLetter(ch);
                letters.append(ch);
            } else {
                others.append(ch);
            }
        }
        System.out.println(numbers);
        System.out.println(letters);
        System.out.println(others);
    }
}
