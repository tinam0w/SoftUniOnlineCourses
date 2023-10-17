package NestedLoopsMore;

import java.util.Scanner;

public class PrimePairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int diffFirst = Integer.parseInt(scanner.nextLine());
        int diffSecond = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= 9 ; i++) {
            for (int j = 0; j <= 9 ; j++) {
                for (int k = 0; k <= 9 ; k++) {
                    for (int l = 0; l <= 9 ; l++) {
                        String oneHalf = "" + i + j;
                        String twoHalf = "" + k + l;
                        int halfOne = Integer.parseInt(oneHalf);
                        int halfTwo = Integer.parseInt(twoHalf);

                        boolean isRange = false;
                        if (halfOne >= first && halfOne <= (first + diffFirst))
                            if (halfTwo >= second && halfTwo <= (second + diffSecond))
                                isRange = true;

                        boolean isPrime1 = false;
                        for (int m = 2; m <= halfOne/2 ; m++) {
                            if (halfOne % m == 0) {
                                isPrime1 = true;
                                break;
                            }
                        }
                        boolean isPrime2 = false;
                        for (int n = 2; n <= halfTwo/2 ; n++) {
                            if (halfTwo % n == 0) {
                                isPrime2 = true;
                                break;
                            }
                        }
                        if (!isPrime1 && !isPrime2 && isRange)
                            System.out.printf("%d%d%d%d%n", i, j, k, l);

                    }
                }
            }
        }


    }
}
