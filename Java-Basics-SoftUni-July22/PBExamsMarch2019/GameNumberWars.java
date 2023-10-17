package PBExamsMarch2019;

import java.util.Scanner;

public class GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String player1 = scanner.nextLine();
        String player2 = scanner.nextLine();
        int total1 = 0;
        int total2 = 0;
        String winner = "";
        int total = 0;
        boolean check = false;

        String input = scanner.nextLine();
        while (!input.equals("End of game")){
            int first = Integer.parseInt(input);
            int second = Integer.parseInt(scanner.nextLine());
            if (first > second) {
                total1 = total1 + (first-second);
            } else if (second > first) {
                total2 = total2 + (second-first);
            } else if (first == second) {
                System.out.println("Number wars!");
                int wars1 = Integer.parseInt(scanner.nextLine());
                int wars2 = Integer.parseInt(scanner.nextLine());
                if (wars1 > wars2){
                    winner = player1;
                    total = total1;
                    check = true;
                } else if (wars2 > wars1) {
                    winner = player2;
                    total = total2;
                    check = true;
                }
                break;
            }
            input = scanner.nextLine();
        }
        if (check)
            System.out.printf("%s is winner with %d points",winner,total);
        else
            System.out.printf("%s has %d points%n%s has %d points",player1,total1,player2,total2);
    }
}
