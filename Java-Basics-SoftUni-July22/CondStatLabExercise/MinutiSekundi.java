package CondStatLabExercise;

import java.util.Scanner;

public class MinutiSekundi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int total = first+second+third;

        int min = total / 60;
        int sec = total % 60;

        if (sec<=9)
            System.out.printf("%d:0%d",min,sec);
        else
            System.out.printf("%d:%d",min,sec);
    }
}
