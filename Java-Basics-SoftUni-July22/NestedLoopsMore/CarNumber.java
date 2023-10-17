package NestedLoopsMore;

import java.util.Scanner;

public class CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int a = Integer.parseInt(scanner.nextLine());
         int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b ; i++) {
            for (int j = a; j <= b ; j++) {
                for (int k = a; k <= b ; k++) {
                    for (int l = a; l <= b ; l++) {
                        int check = 0;
                        if (((i % 2 == 0) && (l % 2 != 0)) || ((i % 2 != 0) && (l % 2 == 0))) check++;
                        if (i > l) check++;
                        if ((j + k) % 2 == 0) check++;
                        if (check == 3)
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                    }
                }
            }
        }
    }
}
