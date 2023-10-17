package PBExamsMarch2019;

import java.util.Scanner;

public class BasketballEqipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int perYear = Integer.parseInt(scanner.nextLine());
        double shoes = perYear * 0.6;
        double suit = shoes * 0.8;
        double ball = suit / 4;
        double accs = ball / 5;
        double all = perYear + shoes + suit + ball + accs;

        System.out.printf("%.2f", all);

    }
}
