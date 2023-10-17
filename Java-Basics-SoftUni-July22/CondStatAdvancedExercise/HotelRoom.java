package CondStatAdvancedExercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double totalStudio = 0;
        double totalApart = 0;

        switch (month){
            case "May":
            case "October":
                totalApart = 65*nights;
                if (nights<=7) totalStudio=50*nights;
                if (nights>7 && nights<=14) totalStudio=50*nights*0.95;
                if (nights>14) totalStudio=50*nights*0.7;
                break;
            case "June":
            case "September":
                totalApart = 68.7*nights;
                if (nights>14) totalStudio=75.2*nights*0.8;
                else totalStudio=75.2*nights;
                break;
            case "July":
            case "August":
                totalApart = 77*nights;
                totalStudio=76*nights;
                break;
        }
        if (nights>14) totalApart=totalApart*0.9;

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.",totalApart,totalStudio);
    }
}
