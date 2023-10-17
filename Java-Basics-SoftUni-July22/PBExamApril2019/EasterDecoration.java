package PBExamApril2019;

import java.util.Scanner;

public class EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double current = 0;
        double total = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            while (!input.equals("Finish")){
                count++;
                if (input.equals("basket"))
                    current += 1.5;
                if (input.equals("wreath"))
                    current += 3.8;
                if (input.equals("chocolate bunny"))
                    current += 7;
                input = scanner.nextLine();
            }
            if (count % 2 == 0) current = current * 0.8;
            System.out.printf("You purchased %d items for %.2f leva.%n", count, current);
            total += current;
            count = 0; current = 0;
        }
        System.out.printf("Average bill per client is: %.2f leva.", total/n);
    }
}
