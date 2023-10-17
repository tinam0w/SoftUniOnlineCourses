package NestedLoopsMore;

import java.util.Scanner;

public class WeddingSeats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        char last = input.charAt(0);
        int rows = Integer.parseInt(scanner.nextLine());
        int seatsOdd = Integer.parseInt(scanner.nextLine());
        int seatsEven = seatsOdd + 2;
        int countAll = 0;

        for (int i = 65; i <= last ; i++) {
            for (int j = 1; j <= rows ; j++) {
                int countOdd = 0;
                int countEven = 0;
                for (int k = 97; k <= (seatsEven + seatsOdd + 97) ; k++) {
                    char section = (char) i;
                    char seat = (char) k;
                    if ((j % 2 != 0) && (countOdd < seatsOdd)) {
                        System.out.printf("%c%d%c%n", section, j, seat);
                        countOdd++; countAll++;
                    } else if ((j % 2 == 0) && (countEven < seatsEven)) {
                        System.out.printf("%c%d%c%n", section, j, seat);
                        countEven++; countAll++;
                    }
                }
            }
            rows = rows + 1;
        }
        System.out.println(countAll);
    }
}
