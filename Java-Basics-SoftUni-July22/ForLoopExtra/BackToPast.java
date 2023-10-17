package ForLoopExtra;

import java.util.Scanner;

public class BackToPast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double legacy = Double.parseDouble(scanner.nextLine());
        int yearsToLive = Integer.parseInt(scanner.nextLine());
        double totalCost = 0;

        for (int i = 1800; i <= yearsToLive; i++) {
            if (i % 2 == 0) {
                totalCost = totalCost + 12000;
            } else {
                totalCost = totalCost + 12000 + 50 * (i - 1800 + 18);
            }
        }
        if (totalCost <= legacy)
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", legacy - totalCost);
        else
            System.out.printf("He will need %.2f dollars to survive.", totalCost - legacy);
    }
}
