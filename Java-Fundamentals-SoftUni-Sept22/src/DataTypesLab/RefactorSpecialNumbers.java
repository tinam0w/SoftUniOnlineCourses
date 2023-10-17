package DataTypesLab;

import java.util.Scanner;

public class RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isSpecialNum = false;
        for (int i = 1; i <= n; i++) {
            int currentNum = i;
            int sum = 0;
            while (currentNum > 0) {
                sum += currentNum % 10;
                currentNum = currentNum / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            if (isSpecialNum)
                System.out.printf("%d -> True%n", i);
            else
                System.out.printf("%d -> False%n", i);
        }
    }
}
