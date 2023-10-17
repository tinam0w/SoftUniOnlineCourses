package NestedLoopsMore;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= first ; i++) {
            for (int j = 1; j <= second ; j++) {
                for (int k = 1; k <= third ; k++) {
                    int count = 0;
                    if (i % 2 == 0) count++;
                    if (j == 2 || j == 3 || j == 5 || j == 7) count++;
                    if (k % 2 == 0) count++;
                    if(count == 3) System.out.printf("%d %d %d%n", i, j, k);
                }
            }
        }
    }
}
