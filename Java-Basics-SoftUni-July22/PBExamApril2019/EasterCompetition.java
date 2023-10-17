package PBExamApril2019;

import java.util.Scanner;

public class EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int allPoints = 0;
        int maxPoints = 0;
        String winner = "";

        int breads = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= breads ; i++) {
            String name = scanner.nextLine();
            String points = scanner.nextLine();
            while (!points.equals("Stop")){
                int currentPoints = Integer.parseInt(points);
                allPoints += currentPoints;
                points = scanner.nextLine();
            }
            System.out.printf("%s has %d points.%n", name, allPoints);

            if (allPoints > maxPoints) {
                maxPoints = allPoints;
                winner = name;
                System.out.printf("%s is the new number 1!%n", name);
            }
            allPoints = 0;
        }
        System.out.printf("%s won competition with %d points!", winner, maxPoints);
    }
}
