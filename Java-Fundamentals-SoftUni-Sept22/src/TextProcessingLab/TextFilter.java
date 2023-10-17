package TextProcessingLab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] banned = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String bann : banned) {
            text = text.replace(bann, repeatString("*", bann.length()));
        }
        System.out.println(text);
    }

    public static String repeatString(String s, int count) {
        String result = "";
        for (int i = 1; i <= count; i++) {
            result += s;
        }
        return result;
    }
}
