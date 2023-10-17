package PBExamsJuly2020;

import java.util.Scanner;

public class BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String topPlayer = "";
        int topGoals = 0;
        boolean isHatTrick = false;

        String name = scanner.nextLine();
        while (!name.equals("END")){
            int goals = Integer.parseInt(scanner.nextLine());
            if (goals > topGoals){
                topPlayer = name;
                topGoals = goals;
            }
            if (goals >= 3)
                isHatTrick = true;
            if (goals >= 10)
                break;
            name = scanner.nextLine();
        }
        System.out.println(topPlayer + " is the best player!");

        if (isHatTrick)
            System.out.println("He has scored " + topGoals + " goals and made a hat-trick !!!");
        else
            System.out.println("He has scored " + topGoals + " goals.");
    }
}
