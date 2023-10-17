package ForLoopExtra;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double priceBus = 0;
        double priceTruck = 0;
        double priceTrain = 0;

        for (int i = 1; i <= n; i++) {
            int weight = Integer.parseInt(scanner.nextLine());
                if (weight <= 3)
                    priceBus = priceBus + (weight * 200);
                else if (weight <= 11)
                     priceTruck = priceTruck + (weight * 175);
                else
                     priceTrain = priceTrain + (weight * 120);
        }

        double totWeight = (priceBus/200) + (priceTruck/175) + (priceTrain/120);
        double avPrice = (priceBus+priceTruck+priceTrain) / totWeight;
        double percBus = ((priceBus/200) / totWeight) * 100;
        double percTruck = ((priceTruck/175) / totWeight) * 100;
        double percTrain = ((priceTrain/120) / totWeight) * 100;

        System.out.printf("%.2f%n", avPrice);
        System.out.printf("%.2f%%%n", percBus);
        System.out.printf("%.2f%%%n", percTruck);
        System.out.printf("%.2f%%%n", percTrain);
    }
}
