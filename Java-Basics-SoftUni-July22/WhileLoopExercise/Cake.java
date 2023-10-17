package WhileLoopExercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int allCake = length * width;
        boolean check = false;

        String input = scanner.nextLine();
        while (!input.equals("STOP")) {
            int pieces = Integer.parseInt(input);
            allCake = allCake - pieces;
            if (allCake <= 0) {
                check = true;
                break;
            }
            input = scanner.nextLine();
        }

        if (!check)
            System.out.printf("%d pieces are left.", allCake);
        else
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(allCake));

    }
}
