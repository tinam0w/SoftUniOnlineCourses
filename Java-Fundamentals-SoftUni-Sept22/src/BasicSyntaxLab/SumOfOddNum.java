package FundamentalsBasicslab;

import java.util.Scanner;

public class SumOfOddNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qnty = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int sum = 0;

        for (int i = 1; ; i++) {
            if (i % 2 != 0) {
                count++;
                System.out.println(i);
                sum += i;
            }
            if (count == qnty) break;
        }
        System.out.printf("Sum: %d", sum);
    }
}
