package FundamentalsBasicsExercise;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = n;
        int sum = 0;

        while (n > 0) {
            int a = n % 10;
            int fact = 1;
            for (int i = 1; i <= a; i++) {
                fact = fact * i;
            }
            sum += fact;
            n = n / 10;
        }

        if (number == sum)
            System.out.print("yes");
        else
            System.out.print("no");
    }
}