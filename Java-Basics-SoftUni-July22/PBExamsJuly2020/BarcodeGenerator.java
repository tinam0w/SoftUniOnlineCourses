package PBExamsJuly2020;

import java.util.Scanner;

public class BarcodeGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = a; i <= b ; i++) {
            int current = i;
            int counter = 0;
            for (int j = 4; j >= 1 ; j--) {
                int digit = current % 10;
                if (digit % 2 != 0)
                    counter++;
                current = current / 10;
            }
            if (counter == 4)
                System.out.print(i + " ");
        }
    }
}
// WRONG CODE !!!!!!!!!!!