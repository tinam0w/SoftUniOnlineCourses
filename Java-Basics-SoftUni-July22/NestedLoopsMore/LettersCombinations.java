package NestedLoopsMore;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char begin = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);
        char skip = scanner.next().charAt(0);
        int count = 0;
        for (int i = begin; i <= end ; i++) {
            for (int j = begin; j <= end ; j++) {
                for (int k = begin; k <= end ; k++) {
                    if (i != skip && j != skip && k != skip) {
                        count++;
                        System.out.printf("%c%c%c ", i, j, k);
                    }
                }
            }
        }
        System.out.printf("%d", count);
    }
}
