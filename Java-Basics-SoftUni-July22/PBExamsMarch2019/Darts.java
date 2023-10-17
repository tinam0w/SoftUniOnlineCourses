package PBExamsMarch2019;

import java.util.Scanner;

public class Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 301;
        boolean check = false;
        int countGood = 0;
        int countBad = 0;
        String player = scanner.nextLine();

        String section = scanner.nextLine();
        while (!section.equals("Retire")){
            int points = Integer.parseInt(scanner.nextLine());
            int current = total;
            if (section.equals("Single")){
                total = total - points;
            } else if (section.equals("Double")) {
                total = total - (points*2);
            } else if (section.equals("Triple")) {
                total = total - (points*3);
            }

            if (total < 0){
                total = current;
                countBad++;
                section = scanner.nextLine();
                continue;
            } else if (total == 0) {
                countGood++;
                check = true;
                break;
            }
            countGood++;
            section = scanner.nextLine();
        }
        if (check)
            System.out.printf("%s won the leg with %d shots.", player, countGood);
        else
            System.out.printf("%s retired after %d unsuccessful shots.", player, countBad);
    }
}
