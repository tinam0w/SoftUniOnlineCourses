package PBExamsMarch2020;

import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerMeter = Double.parseDouble(scanner.nextLine());

        double total = distance * secPerMeter;
        double delay = (Math.floor(distance / 50) * 30);
        total = total + delay;

        if (total < record)
            System.out.printf("Yes! The new record is %.2f seconds.", total);
        else
            System.out.printf("No! He was %.2f seconds slower.", total - record);


    }
}
