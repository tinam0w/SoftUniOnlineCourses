package PBExamsJune2019;

import java.util.Scanner;

public class MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        String ticket = "     ";
        char letter = ' ';

        for (int m = 0; m <= 5 ; m++) {
            for (int k = 1; k <= n / 2; k++) {
                for (int j = 1; j <= n; j++) {
                    for (int i = a1 + 1; i < a2; i++) {
                        letter = (char) i;
                        System.out.print(letter + "-");
                    }
                    System.out.print(j);
                }
                System.out.print(k);
            }
            int ascii = letter;
            System.out.println(ascii);
        }
    }
    }

