package PBExamAugust2022;

import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        boolean isOver = false;

        for (int a = 1; a <= 9 ; a++) {
            for (int b = 9; b >= a ; b--) {
                for (int c = 0; c <= 9; c++) {
                    for (int d = 9; d >= c ; d--) {
                        if ((a + b + c + d) == (a * b * c * d))
                            if (n % 10 == 5) {
                                System.out.printf("%d%d%d%d%n", a, b, c, d);
                                isOver = true;
                                break;
                            }
                        if ((a * b * c * d) / (a + b + c + d) == 3)
                            if (n % 3 == 0){
                                System.out.printf("%d%d%d%d%n", d, c, b, a);
                                isOver = true;
                                break;
                            }
                    }
                    if (isOver) break;
                }
                if (isOver) break;
            }
            if (isOver) break;
        }
        if (!isOver)
            System.out.println("Nothing found");
    }
}
