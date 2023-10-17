package ForLoopExtra;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int prevTotal = 0;
        int count = 0;
        int maxDiff = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            int a = Integer.parseInt(scanner.nextLine());
            int b = Integer.parseInt(scanner.nextLine());
            int currentTotal = a + b;
            if (i > 1 && Math.abs(currentTotal - prevTotal) > maxDiff)
                maxDiff = Math.abs(currentTotal - prevTotal);
            if (prevTotal == currentTotal)
                count++;
            else
                prevTotal = currentTotal;

        }
        if ((count + 1) == n)
            System.out.println("Yes, value=" + prevTotal);
        else
            System.out.println("No, maxdiff=" + maxDiff);
    }
}