package PBExamApril2019;

import java.util.Scanner;

public class EasterEggsBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int one = Integer.parseInt(scanner.nextLine());
        int two = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("End")){
            if (input.equals("one")) two = two - 1;
            if (input.equals("two")) one = one - 1;
            if (one == 0 || two == 0) break;
            input = scanner.nextLine();
        }

        if (one == 0)
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", two);
        else if (two == 0)
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", one);
        else
            System.out.printf("Player one has %d eggs left.%nPlayer two has %d eggs left.", one,two);

    }
}
