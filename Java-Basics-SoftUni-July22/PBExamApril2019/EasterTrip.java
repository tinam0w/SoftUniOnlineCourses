package PBExamApril2019;

import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String days = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double total = 0;

        switch (destination){
            case "France":
                if (days.equals("21-23")) total = nights * 30;
                if (days.equals("24-27")) total = nights * 35;
                if (days.equals("28-31")) total = nights * 40;
                break;
            case  "Italy":
                if (days.equals("21-23")) total = nights * 28;
                if (days.equals("24-27")) total = nights * 32;
                if (days.equals("28-31")) total = nights * 39;
                break;
            case "Germany":
                if (days.equals("21-23")) total = nights * 32;
                if (days.equals("24-27")) total = nights * 37;
                if (days.equals("28-31")) total = nights * 43;
                break;
        }
        System.out.printf("Easter trip to %s : %.2f leva.", destination,total);
    }
}
