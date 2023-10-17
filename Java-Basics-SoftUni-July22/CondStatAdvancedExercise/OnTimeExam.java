package CondStatAdvancedExercise;

import java.util.Scanner;

public class OnTimeExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int arrivingHour = Integer.parseInt(scanner.nextLine());
        int arrivingMin = Integer.parseInt(scanner.nextLine());
        int exam = 0;
        int arrive = 0;
        int hour = 0;
        int min = 0;

        exam = examMin + (examHour*60);
        arrive = arrivingMin + (arrivingHour*60);
        int diff = exam - arrive;
        hour = Math.abs(diff) / 60;
        min = Math.abs(diff) % 60;

        if (diff < 0) {
            if (hour != 0 && ((min > 9) || (min == 0))) System.out.printf("Late%n%d:%02d hours after the start", hour, min);
            if (hour != 0 && ((min < 10) && (min != 0))) System.out.printf("Late%n%d:%02d hours after the start", hour, min);
            if (hour == 0 && ((min > 9) || (min == 0))) System.out.printf("Late%n%02d minutes after the start", min);
            if (hour == 0 && ((min < 10) && (min != 0))) System.out.printf("Late%n%d minutes after the start", min);
        } else if (diff == 0) {
            System.out.println("On time");
        }
        else if (diff <= 30) {
            if (hour != 0 && ((min > 9) || (min == 0))) System.out.printf("On time%n%d:%02d hours before the start", hour, min);
            if (hour != 0 && ((min < 10) && (min != 0)))  System.out.printf("On time%n%d:%02d hours before the start", hour, min);
            if (hour == 0 && ((min > 9) || (min == 0))) System.out.printf("On time%n%02d minutes before the start",min);
            if (hour == 0 && ((min < 10) && (min != 0))) System.out.printf("On time%n%d minutes before the start",min);
        }
        else {
            if (hour != 0 && ((min > 9) || (min == 0))) System.out.printf("Early%n%d:%02d hours before the start", hour, min);
            if (hour != 0 && ((min < 10) && (min != 0))) System.out.printf("Early%n%d:%02d hours before the start", hour, min);
            if (hour == 0 && ((min > 9) || (min == 0))) System.out.printf("Early%n%02d minutes before the start", min);
            if (hour == 0 && ((min < 10) && (min != 0))) System.out.printf("Early%n%d minutes before the start", min);
        }
    }
}
