package nestedLoopsLab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;
        boolean check = false;

        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            double budget = Double.parseDouble(scanner.nextLine());

            for (int i = 1; ; i++) {
                double saved = Double.parseDouble(scanner.nextLine());
                total += saved;
                if (total >= budget) {
                    System.out.printf("Going to %s!%n", destination);
                    total = 0;
                    break;
                };
            }
            destination = scanner.nextLine();
        }
    }
}