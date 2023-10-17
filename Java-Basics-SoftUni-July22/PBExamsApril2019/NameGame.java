package PBExamsApril2019;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        int points = 0;
        int maxPoints = Integer.MIN_VALUE;
        String current = "";

        String name = scanner.nextLine();
        while (!name.equals("Stop")){
            n = name.length();
            for (int i = 0; i < n ; i++) {
                int number = Integer.parseInt(scanner.nextLine());
                if (name.charAt(i) == number) points += 10;
                else points += 2;
            }
            if (points >= maxPoints) {
                maxPoints = points;
                current = name;
            }
            points = 0;
            name = scanner.nextLine();
        }

        System.out.printf("The winner is %s with %d points!",current,maxPoints);
    }
}
