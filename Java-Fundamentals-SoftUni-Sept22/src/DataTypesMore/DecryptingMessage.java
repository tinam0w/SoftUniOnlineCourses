package DataTypesMore;

import java.util.Scanner;

public class DecryptingMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String result = "";
        for (int i = 1; i <= n ; i++) {
            char input = scanner.nextLine().charAt(0);
            int decrypted = (int) input + key;
            char symbol = (char) decrypted;
            result += symbol;
        }
        System.out.println(result);
    }
}
