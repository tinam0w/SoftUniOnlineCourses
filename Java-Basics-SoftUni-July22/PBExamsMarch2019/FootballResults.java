package PBExamsMarch2019;

import java.util.Scanner;

public class FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //String first = scanner.nextLine();
        //String second = scanner.nextLine();
        //String third = scanner.nextLine();
        int won = 0;
        int lost = 0;
        int drawn = 0;

        for (int i = 1; i <= 3 ; i++) {
            String input = scanner.nextLine();
            int home = input.charAt(0);
            int guest = input.charAt(2);
            if (home > guest) won++;
            if (home < guest) lost++;
            if (home == guest) drawn++;
        }

        System.out.printf("Team won %d games.%n" +
                "Team lost %d games.%n" +
                "Drawn games: %d",won, lost, drawn);
    }
}
