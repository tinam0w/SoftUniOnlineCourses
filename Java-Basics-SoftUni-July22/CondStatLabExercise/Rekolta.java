package CondStatLabExercise;

import java.util.Scanner;

public class Rekolta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double loze = Double.parseDouble(scanner.nextLine());
        double grozde = Double.parseDouble(scanner.nextLine());
        double vino = Double.parseDouble(scanner.nextLine());
        double rabot = Double.parseDouble(scanner.nextLine());

        double loze1 = loze*0.4;
        double rekolta = loze1*grozde;
        double vino1 = rekolta/2.5;

        if (vino1>=vino) {
            double a = Math.floor(vino1);
            double b = Math.ceil(vino1-vino);
            double c = Math.ceil(b/rabot);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.",a);
            System.out.printf("%n%.0f liters left -> %.0f liters per person.",b,c);
        }
        else {
            double a = Math.floor(vino-vino1);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.",a);
        }

    }
}
