package FundamentalsBasicMore;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String result = "";
        for (int i = input.length()-1; i >=0 ; i--) {
            char letter = input.charAt(i);
            result += letter;
        }
        System.out.println(result);
    }
}
