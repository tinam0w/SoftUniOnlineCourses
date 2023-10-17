package PBExamsJune2019;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalFree = Integer.parseInt(scanner.nextLine());
        int totalBooked = 0;
        int income = 0;
        boolean check = false;

        String input = scanner.nextLine();
        while (!input.equals("Movie time!")){
            int n = Integer.parseInt(input);
            totalBooked += n;
            if (totalBooked > totalFree){
                check = true;
                break;
            }
            if (n % 3 == 0) income += (n * 5) - 5;
            else income += n * 5;
            input = scanner.nextLine();
        }
        if (!check) {
            System.out.printf("There are %d seats left in the cinema.%n", totalFree - totalBooked);
            System.out.printf("Cinema income - %d lv.", income);
        } else {
            System.out.println("The cinema is full.");
            System.out.printf("Cinema income - %d lv.", income);
        }

    }
}
