package FinalExam05;

import java.util.Scanner;

public class SinoTheWalker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] timeStarts = scanner.nextLine().split(":");
        int steps = Integer.parseInt(scanner.nextLine());
        int stepTime = Integer.parseInt(scanner.nextLine());

        int sedToAdd = steps * stepTime;
        int startTimeInSec = (Integer.parseInt(timeStarts[0]) * 60 * 60) + (Integer.parseInt(timeStarts[1]) * 60) + Integer.parseInt(timeStarts[2]);
        int timeResult = sedToAdd + startTimeInSec;

        int hours = timeResult / (60 * 60);
        timeResult = timeResult % (60 * 60);
        int mins = timeResult / 60;
        int secs = timeResult % 60;
        if (hours >= 24)
            hours = hours - 24;

        System.out.printf("Time Arrival: %02d:%02d:%02d", hours, mins, secs);

    }
}
