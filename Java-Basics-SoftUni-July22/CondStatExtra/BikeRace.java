package CondStatExtra;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double junior = Double.parseDouble(scanner.nextLine());
        double senior = Double.parseDouble(scanner.nextLine());
        String type = scanner.nextLine();

        double junTotal = 0;
        double senTotal = 0;

        if (type.equals("trail")) {
            junTotal = junior*5.5;
            senTotal = senior*7;}
        else if (type.equals("cross-country")) {
            junTotal = junior*8;
            senTotal=senior*9.5;
            if ((junior+senior)>=50) {
                junTotal=junTotal*0.75;
                senTotal=senTotal*0.75;
            }
        }
        else if (type.equals("downhill")) {
            junTotal=junior*12.25;
            senTotal=senior*13.75; }
        else if (type.equals("road")) {
            junTotal=junior*20;
            senTotal=senior*21.50; }

        System.out.printf("%.2f",((junTotal+senTotal)*0.95));

    }
}
