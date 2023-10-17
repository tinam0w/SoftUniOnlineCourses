package CondStatAdvancedExercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String room = scanner.nextLine();
        String feedback = scanner.nextLine();
        int nights = days-1;

        double total = 0;

        if (room.equals("room for one person"))
            total = nights * 18;
        else if (room.equals("apartment")) {
            total = nights * 25;
            if (days < 10) total = total * 0.7;
            else if (days >= 10 && days <= 15) total = total * 0.65;
            else if (days > 15) total = total * 0.5;
        } else if (room.equals("president apartment")) {
            total = nights * 35;
            if (days < 10) total = total * 0.9;
            else if (days <= 15) total = total * 0.85;
            else if (days > 15) total = total * 0.8;
        }

        if (feedback.equals("positive")) total = total * 1.25;
        if (feedback.equals("negative")) total = total * 0.9;
        System.out.printf("%.2f",total);


    }
}
