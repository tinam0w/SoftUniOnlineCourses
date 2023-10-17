package ArraysMore;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        if (n > 1) {
            int[] intArr = new int[n];
            intArr[0] = 1;
            intArr[1] = 1;
            for (int i = 2; i < n; i++) {
                intArr[i] = intArr[i - 2] + intArr[i - 1];
            }
            System.out.println(intArr[n - 1]);
        } else if (n == 1) {
            System.out.println("1");
        }
    }
}
