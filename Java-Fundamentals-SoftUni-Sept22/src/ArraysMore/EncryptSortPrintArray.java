package ArraysMore;

import java.util.Arrays;
import java.util.Scanner;

public class EncryptSortPrintArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        if (n > 0) {
            int[] numbersArr = new int[n];

            for (int i = 0; i < n; i++) {
                String input = scanner.nextLine();
                int vowels = 0;
                int notVowels = 0;
                for (int j = 0; j <= input.length() - 1; j++) {
                    if (input.charAt(j) >= 65 || input.charAt(j) <= 90
                            || input.charAt(j) >= 97
                            || input.charAt(j) <= 122) {
                        if (input.charAt(j) == 'a'
                                || input.charAt(j) == 'e'
                                || input.charAt(j) == 'i'
                                || input.charAt(j) == 'o'
                                || input.charAt(j) == 'u'
                                || input.charAt(j) == 'A'
                                || input.charAt(j) == 'E'
                                || input.charAt(j) == 'I'
                                || input.charAt(j) == 'O'
                                || input.charAt(j) == 'U')
                            vowels += (input.charAt(j) * input.length());
                        else
                            notVowels += input.charAt(j) / input.length();
                    }
                }
                numbersArr[i] = vowels + notVowels;
            }

                Arrays.sort(numbersArr);

                for (int item : numbersArr) {
                System.out.println(item);
            }
        }
    }
}
