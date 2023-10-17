package PBExamsMarch2019;

import java.util.Scanner;

public class BasketballTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countHome = 0;
        int countGuest = 0;
        int countWin = 0;
        int countLost = 0;
        int countTours = 0;

        String tours = scanner.nextLine();
        while (!tours.equals("End of tournaments")){
            int games = Integer.parseInt(scanner.nextLine());
            countTours ++;
            for (int i = 1; i <= games ; i++) {
                int home = Integer.parseInt(scanner.nextLine());
                int guest = Integer.parseInt(scanner.nextLine());
                if (home > guest) {
                    countHome = home - guest;
                    countWin++;
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tours, countHome);
                } else if (guest > home) {
                    countGuest = guest - home;
                    countLost++;
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tours, countGuest);
                }
            }
            tours = scanner.nextLine();
        }

        System.out.printf("%.2f%% matches win%n" +
                "%.2f%% matches lost", (countWin*1.0/(countWin+countLost))*100, (countLost*1.0/(countWin+countLost))*100);
    }
}
