package PBExamsAugust2022;

import java.util.Scanner;

public class GoldMine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int locations = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= locations ; i++) {
            double avGoldTarget = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int allGold = 0;
            for (int j = 1; j <= days ; j++) {
                double goldToday = Double.parseDouble(scanner.nextLine());
                allGold += goldToday;
            }
            double avGoldMade = allGold * 1.0 / days;
            if (avGoldMade >= avGoldTarget)
                System.out.printf("Good job! Average gold per day: %.2f.%n", avGoldMade);
            else
                System.out.printf("You need %.2f gold.%n", avGoldTarget-avGoldMade);
        }
    }
}
