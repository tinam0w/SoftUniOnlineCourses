package FundamentalsBasicsExercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGames = Integer.parseInt(scanner.nextLine());
        double headsetCost = Double.parseDouble(scanner.nextLine());
        double mouseCost = Double.parseDouble(scanner.nextLine());
        double keyboardCost = Double.parseDouble(scanner.nextLine());
        double displayCost = Double.parseDouble(scanner.nextLine());

        int headsetDown = 0;
        int mouseDown = 0;
        int keyboardDown = 0;
        int displayDown = 0;

        for (int i = 1; i <= lostGames ; i++) {
            if (i % 2 == 0)
                headsetDown++;
            if (i % 3 == 0)
                mouseDown++;
            if (i % 6 == 0)
                keyboardDown++;
            if (i % 12 == 0)
                displayDown++;
        }

        double totalCost = headsetDown * headsetCost
                + mouseDown * mouseCost
                + keyboardDown * keyboardCost
                + displayDown * displayCost;
        System.out.printf("Rage expenses: %.2f lv.", totalCost);
    }
}
