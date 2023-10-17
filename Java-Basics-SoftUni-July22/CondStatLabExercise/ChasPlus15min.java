package CondStatLabExercise;

import java.util.Scanner;

public class ChasPlus15min {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int total = hour*60 + min + 15;

        int newhour =  total / 60;
        int newmin = total % 60;

        if (newhour >23) newhour = 0;

        if (newmin<10) System.out.printf("%d:0%d", newhour, newmin);
        else System.out.printf("%d:%d", newhour,newmin);


    }
}
