package TextProcessingMore;

import java.util.Random;
import java.util.Scanner;

public class AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Character begin = scanner.nextLine().charAt(0);
        Character end = scanner.nextLine().charAt(0);
        String input = scanner.nextLine();
        int sum = 0;
        int index = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) > begin && input.charAt(i) < end) {
                sum += input.charAt(i);
            }
        }
        System.out.println(sum);
    }
}
