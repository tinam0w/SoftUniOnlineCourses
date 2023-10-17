package WhileLoopExercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = Double.parseDouble(scanner.nextLine());
        double sumCoins = Math.round(sum * 100);
        int coins = 0;

        while (sumCoins > 0) {
            if (sumCoins >= 200) {
                coins++;
                sumCoins = sumCoins - 200;
            } else if (sumCoins >= 100) {
                coins++;
                sumCoins = sumCoins - 100;
            } else if (sumCoins >= 50) {
                coins++;
                sumCoins = sumCoins - 50;
            } else if (sumCoins >= 20) {
                coins++;
                sumCoins = sumCoins - 20;
            } else if (sumCoins >= 10) {
                coins++;
                sumCoins = sumCoins - 10;
            } else if (sumCoins >= 5) {
                coins++;
                sumCoins = sumCoins - 5;
            } else if (sumCoins >= 2) {
                coins++;
                sumCoins = sumCoins - 2;
            } else if (sumCoins >= 1) {
                coins++;
                sumCoins = sumCoins - 1;
            }
            else break;
    }
        System.out.println(coins);
}
}
