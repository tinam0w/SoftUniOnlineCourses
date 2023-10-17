package CondStatLabExercise;

import java.util.Scanner;

public class SwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rekord = Double.parseDouble(scanner.nextLine());
        double razstoqnie = Double.parseDouble(scanner.nextLine());
        double vreme = Double.parseDouble(scanner.nextLine());

        double razstoqnie1 = Math.floor(razstoqnie/15);
        double res = razstoqnie*vreme + (razstoqnie1*12.5);

        if (res>=rekord)
            System.out.printf("No, he failed! He was %.2f seconds slower.",(res-rekord));
        else
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",res);
    }
}
