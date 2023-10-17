package FundamentalsBasicslab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        if (k > 10)
            System.out.printf("%d X %d = %d", n, k, n * k);
        else {
        for (int i = k; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n", n, i, n * i);
        }
        }
    }
}
