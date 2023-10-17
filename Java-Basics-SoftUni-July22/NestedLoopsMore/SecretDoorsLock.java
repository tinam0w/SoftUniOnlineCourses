package NestedLoopsMore;

import java.util.Scanner;

public class SecretDoorsLock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        for (int i = 2; i <= first ; i++) {
            for (int j = 2; j <= second ; j++) {
                for (int k = 2; k <= third ; k++) {
                    if ((i % 2 == 0) && (k % 2 == 0)){
                        if ((j == 2) || (j == 3) || (j == 5) || (j == 7)){
                            System.out.printf("%d %d %d%n", i, j, k);
                        }
                    }
                }
            }
        }
    }
}
