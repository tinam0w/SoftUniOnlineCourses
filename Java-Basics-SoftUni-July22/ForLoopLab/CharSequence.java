package ForLoopLab;

import java.util.Scanner;

public class CharSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int len = text.length();

        for (int i = 0; i < len; i=i+1) {    // i <= len - 1
            System.out.println(text.charAt(i));
        }
    }
}
