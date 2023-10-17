package PBExamsMarch2020;

import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minWalking = Integer.parseInt(scanner.nextLine());
        int timesWalking = Integer.parseInt(scanner.nextLine());
        int calories = Integer.parseInt(scanner.nextLine());

        double totalMin = timesWalking * minWalking;
        double burnedCal = totalMin * 5;

        if (burnedCal >= calories * 0.5)
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %.0f.", burnedCal);
        else
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %.0f.", burnedCal);
    }
}
