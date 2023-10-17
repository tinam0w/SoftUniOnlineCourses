package PBExamsApril2019;

import java.util.Locale;
import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double points = 0;
        double maxPoints = Integer.MIN_VALUE;
        String winner = "";

        String input = scanner.nextLine();
        while (!input.equals("End of words")){
            int n = input.length();
            for (int i = 0; i < n; i++) {
                points = points + input.charAt(i);
            }
            String current = input.toLowerCase();
            if (current.charAt(0) == 'a' || current.charAt(0) == 'e' ||
                    current.charAt(0) == 'i' || current.charAt(0) == 'o' ||
                    current.charAt(0) == 'u' || current.charAt(0) == 'y')
                points = points * n;
            else points = Math.floor(points/n);
            if (points > maxPoints) {
                maxPoints = points;
                winner = input;
            }
            points = 0;
            input = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %.0f",winner, maxPoints);
    }
}
