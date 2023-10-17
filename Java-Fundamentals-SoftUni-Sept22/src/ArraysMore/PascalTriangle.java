package ArraysMore;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        if (n >= 1 && n <= 60) {

            int lastRowArr[] = new int[n];
            for (int i = 1; i <= n; i++) {
                int[] currentRowArr = new int [n];
                for (int j = 1; j <= i; j++) {
                    if (j == 1 || j == i) {
                        currentRowArr[j - 1] = 1;
                        System.out.print(1 + " ");
                    } else {
                        int item = lastRowArr[i - j - 1] + lastRowArr[i - j];
                        currentRowArr[j - 1] = item;
                        System.out.print(item + " ");
                    }
                }
                System.out.println();
                lastRowArr = currentRowArr;
            }
        }
    }
}