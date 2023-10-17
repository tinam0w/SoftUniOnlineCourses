package PBExamsApril2019;

import java.util.Scanner;

public class Renovation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        double nonPaint = Integer.parseInt(scanner.nextLine());
        double allArea = (height * width) * 4;
        nonPaint = (100 - nonPaint)/100;
        allArea = Math.ceil(allArea * nonPaint);
        double paintedArea = 0;
        int countWalls = 0;

        String input = scanner.nextLine();
        while (!input.equals("Tired!")){
            double paint = Double.parseDouble(input);
            paintedArea = paintedArea + paint;
            countWalls = countWalls + 1;
            if (paintedArea >= allArea || countWalls == 4) break;
            input = scanner.nextLine();
        }

        if (input.equals("Tired!"))
            System.out.printf("%.0f quadratic m left.", Math.abs(allArea - paintedArea));
        else if (paintedArea > allArea)
            System.out.printf("All walls are painted and you have %.0f l paint left!", paintedArea - allArea);
        else if (paintedArea == allArea)
            System.out.print("All walls are painted! Great job, Pesho!");

    }
}
