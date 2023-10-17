package JavaAdvanced.StacksAndQueueExersice;

import java.util.Scanner;

public class factoriel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //5! = 1 * 2 * 3 * 4 * 5 = 4! * 5 = 3! * 4 * 5..
        System.out.println(fact(6));
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else
            return fact(n - 1) * n; //рекурсия
    }
}
