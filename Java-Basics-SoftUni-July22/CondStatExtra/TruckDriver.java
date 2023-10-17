package CondStatExtra;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double km = Double.parseDouble(scanner.nextLine());
        double total = 0;

        if (km<=5000) {
            if (season.equals("Spring")) total=km*4*0.75;
            if (season.equals("Autumn")) total=km*4*0.75;
            if (season.equals("Summer")) total=km*4*0.9;
            if (season.equals("Winter")) total=km*4*1.05;
        } else if (km>5000 && km<=10000) {
            if (season.equals("Spring")) total=km*4*0.95;
            if (season.equals("Autumn")) total=km*4*0.95;
            if (season.equals("Summer")) total=km*4*1.1;
            if (season.equals("Winter")) total=km*4*1.25;
        } else if (km>10000 && km<=20000) {
            total=km*4*1.45;
        }
        System.out.printf("%.2f",total*0.9);

    }
}
