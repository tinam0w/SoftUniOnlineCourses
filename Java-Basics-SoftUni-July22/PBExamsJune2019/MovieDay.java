package PBExamsJune2019;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetTime = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int lasting = Integer.parseInt(scanner.nextLine());

        double realTime = (scenes * lasting) + (targetTime * 0.15);

        if (realTime <= targetTime)
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", targetTime-realTime);
        else
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", realTime-targetTime);
    }
}
