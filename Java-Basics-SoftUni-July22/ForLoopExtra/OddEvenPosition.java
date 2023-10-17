package ForLoopExtra;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double oddSum = 0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0D;
        double evenSum = 0;
        double evenMin = 1000000000.0D;
        double evenMax = -1000000000.0D;

        for (int i = 1; i <= n; i++) {
            double input = Double.parseDouble(scanner.nextLine());
            if (i % 2 == 0) {
                evenSum = evenSum + input;
                if (input > evenMax) evenMax = input;
                if (input < evenMin) evenMin = input;
            } else {
                oddSum = oddSum + input;
                if (input > oddMax) oddMax = input;
                if (input < oddMin) oddMin = input;
            }
        }

        System.out.printf("OddSum=%.2f,%n", oddSum);

        if (oddMin == 1000000000.0)
            System.out.println("OddMin=No,");
        else
            System.out.printf("OddMin=%.2f,%n", oddMin);

        if (oddMax == -1000000000.0)
            System.out.println("OddMax=No,");
        else
            System.out.printf("OddMax=%.2f,%n", oddMax);

        System.out.printf("EvenSum=%.2f,%n", evenSum);

        if (evenMin == 1000000000.0)
            System.out.println("EvenMin=No,");
        else
            System.out.printf("EvenMin=%.2f,%n", evenMin);

        if (evenMax == -1000000000.0)
            System.out.println("EvenMax=No");
        else
            System.out.printf("EvenMax=%.2f", evenMax);
        }
    }
