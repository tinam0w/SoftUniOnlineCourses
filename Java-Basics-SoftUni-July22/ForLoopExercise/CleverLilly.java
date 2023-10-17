package ForLoopExercise;

import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double price = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        double total = 0;
        int money = 0;
        int toy = 0;

        for (int i = 1; i <= age ; i++) {
            if (i % 2 != 0)
                toy = toy + 1;
            else
                money = (money + (10*(i/2)))-1;
        }

        total = money + toy*toyPrice;
        if (total >= price)
            System.out.printf("Yes! %.2f", total - price);
        else
            System.out.printf("No! %.2f", price - total);

    }
}
