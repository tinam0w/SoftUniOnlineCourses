package PBExamsMarch2020;

import java.util.Scanner;

public class TournamentofChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMoney = 0;
        int winDays = 0;
        int lostDays = 0;

        int days = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= days ; i++) {
            String input = scanner.nextLine();
            double totalDayMoney = 0;
            int winGames = 0;
            int lostGames = 0;
            while (!input.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    totalDayMoney += 20;
                    winGames++;
                } else
                    lostGames++;
                input = scanner.nextLine();
            }
            if (winGames > lostGames) {
                totalDayMoney = totalDayMoney * 1.1;
                winDays++;
            } else
                lostDays++;
            totalMoney += totalDayMoney;
        }
        if (winDays > lostDays) {
            totalMoney = totalMoney * 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);

    }
}
