package CondStatLabExercise;

import java.util.Scanner;

public class HranaJivotni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dni = Integer.parseInt(scanner.nextLine());
        double ostavena = Double.parseDouble(scanner.nextLine());
        double dog = Double.parseDouble(scanner.nextLine());
        double cat = Double.parseDouble(scanner.nextLine());
        double turtle = Double.parseDouble(scanner.nextLine());

        double total = dni*(dog+cat+(turtle/1000));
        double ost = Math.abs(total-ostavena);
        if (ostavena>=total) {
            double a = Math.floor(ost);
            System.out.printf("%.0f kilos of food left.", a);
        }
        else {
            double a = Math.ceil(ost);
            System.out.printf("%.0f more kilos of food are needed.",a);
        }
    }
}
