package NestedLoopsMore;

import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int maxPasswords = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean isOver = false;

        for (int A = 35; A < 55 ; A++) {
            for (int B = 64; B < 96 ; B++) {
                for (int x = 1; x <= a ; x++) {
                    for (int y = 1; y <= b ; y++) {
                        char C = (char) A;
                        char D = (char) B;
                        System.out.printf("%c%c%d%d%c%c|", C, D, x, y, D, C);
                        if (x == a && y == b) isOver = true;
                        count++; A++; B++;
                        if (A > 55) A = 35;
                        if (B > 96) A = 64;
                        if (count == maxPasswords) {
                            isOver = true;
                            break;
                        }
                    }
                    if (isOver) break;
                }
                if (isOver) break;
            }
            if (isOver) break;
        }
    }

}
