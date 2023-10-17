package PBExamsMarch2019;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutes = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        int seconds100m = Integer.parseInt(scanner.nextLine());
        double time = 0;

        int targetTime = seconds + (minutes * 60);
        double shortTime = length / 120;
        shortTime = shortTime*2.5;
        time = (length/100)*seconds100m - shortTime;

        if (time <= targetTime)
            System.out.printf("Marin Bangiev won an Olympic quota!%n" +
                    "His time is %.3f.", time);
        else
            System.out.printf("No, Marin failed! He was %.3f second slower.", time-targetTime);

    }
}
