package CondStatLabExercise;

import java.util.Scanner;

public class Kingkongproduction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double statisti = Double.parseDouble(scanner.nextLine());
        double obleklo = Double.parseDouble(scanner.nextLine());

        double dekor = budget*0.1;
        if (statisti>=150) obleklo=obleklo*0.9;

        if ((dekor+statisti*obleklo)>budget)
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.",((dekor+statisti*obleklo))-budget);
        else
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.",(budget-(dekor+(statisti*obleklo))));


        }
    }

