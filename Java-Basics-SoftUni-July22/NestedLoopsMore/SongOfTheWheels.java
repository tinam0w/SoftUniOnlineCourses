package NestedLoopsMore;

import java.util.Scanner;

public class SongOfTheWheels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean check = false;
        String code = "";

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (((a * b) + (c * d)) == m)
                            if (a < b)
                                if (c > d) {
                                    check = true;
                                    count++;
                                    System.out.printf("%d%d%d%d ", a, b, c, d);
                                    if (count == 4)
                                        code = "" + a + b + c + d;
                                }

                    }
                }
            }
        }
        if (!check || count < 4) {
            System.out.println();
            System.out.println("No!");
        } else{
            System.out.println();
            System.out.printf("Password: %s", code);
        }
    }
}
