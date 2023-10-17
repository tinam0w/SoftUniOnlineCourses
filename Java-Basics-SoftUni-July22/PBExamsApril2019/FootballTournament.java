package PBExamsApril2019;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = 0;
        int d = 0;
        int l = 0;
        int points = 0;

        String team = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            String res = scanner.nextLine();
            char result = res.charAt(0);
            switch (result){
                case 'W':
                    w++;
                    points += 3;
                    break;
                case 'D':
                    d++;
                    points+= 1;
                    break;
                case 'L':
                    l++;
                    break;
            }
        }
        if (n < 1)
            System.out.printf("%s hasn't played any games during this season.", team);
        else {
            System.out.printf("%s has won %d points during this season.%n", team, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n",w);
            System.out.printf("## D: %d%n",d);
            System.out.printf("## L: %d%n",l);
            System.out.printf("Win rate: %.2f%%",(((w*1.0)/n)*100));
        }
    }
}
