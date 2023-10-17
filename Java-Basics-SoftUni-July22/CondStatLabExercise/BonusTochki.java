package CondStatLabExercise;

import java.util.Scanner;

public class BonusTochki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tochki = Double.parseDouble(scanner.nextLine());
        double bonus = 0;

        if (tochki<=100)
            bonus=5;
        else if (tochki>100 && tochki<=1000)
            bonus=tochki*0.2;
        else if (tochki>1000)
            bonus=tochki*0.1;

        if ((tochki % 2) == 0)
            bonus+=1;
        else if ((tochki % 5) == 0)
            bonus+=2;

        System.out.printf("%.1f%n%.1f",bonus,(bonus+tochki));

    }
}
