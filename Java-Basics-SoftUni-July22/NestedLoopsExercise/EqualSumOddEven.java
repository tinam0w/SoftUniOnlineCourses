package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());

        for (int i = first; i <= second ; i++) {
            String num = "" + i;
            int oddSum = 0;
            int evenSum = 0;
            for (int j = 0; j < num.length(); j++) {
                int digit = Integer.parseInt("" + num.charAt(j));
                if (j % 2 == 0)
                    evenSum += digit;
                else
                    oddSum += digit;
            }
            if (evenSum == oddSum)
                System.out.print(i + " ");
        }
    }
}
