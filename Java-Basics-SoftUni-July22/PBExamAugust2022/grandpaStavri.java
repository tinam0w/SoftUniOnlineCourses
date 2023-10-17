package PBExamAugust2022;

import java.util.Scanner;

public class grandpaStavri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalLitres = 0;
        double finalDegrees = 0;

        for (int i = 1; i <= n ; i++) {
            double rakiya = Double.parseDouble(scanner.nextLine());
            double degree = Double.parseDouble(scanner.nextLine());
            totalLitres += rakiya;
            finalDegrees += rakiya * degree;
        }

        double averageDegree = finalDegrees / totalLitres;
        System.out.printf("Liter: %.2f%n", totalLitres);
        System.out.printf("Degrees: %.2f%n", averageDegree);
        if (averageDegree < 38)
            System.out.println("Not good, you should baking!");
        else if (averageDegree <= 42)
            System.out.println("Super!");
        else if (averageDegree > 42)
            System.out.println("Dilution with distilled water!");
    }
}
