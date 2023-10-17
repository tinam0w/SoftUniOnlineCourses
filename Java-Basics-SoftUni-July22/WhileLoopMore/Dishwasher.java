package WhileLoopMore;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int detergent = bottles * 750;
        int dishes = 0;
        int pots = 0;
        int count = 0;
        int usedDetergent = 0;
        boolean check = false;

        String input = scanner.nextLine();
        while (!input.equals("End")){
            int allDishes = Integer.parseInt(input);
            count++;
            if (count % 3 == 0){
                usedDetergent = usedDetergent + (allDishes * 15);
                pots = pots + allDishes;
            } else {
                usedDetergent = usedDetergent + (allDishes * 5);
                dishes = dishes + allDishes;
            }
            if (usedDetergent > detergent) {
                check = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (!check)
            System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %d ml.",dishes, pots, detergent-usedDetergent );
        else
            System.out.printf("Not enough detergent, %d ml. more necessary!", usedDetergent-detergent);

    }
}
