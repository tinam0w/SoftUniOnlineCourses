package PBExamsJune2019;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double total = 0;
        boolean check = false;

        String actor = scanner.nextLine();
        while (!actor.equals("ACTION")){
            double payment = 0;
            if (actor.length() <= 15){
                payment = Double.parseDouble(scanner.nextLine());
                total += payment;
            } else {
                payment = (budget - total) * 0.2;
                total += payment;
            }
            if (total >= budget){
                check = true;
                break;
            }
            actor = scanner.nextLine();
        }
        if (!check)
            System.out.printf("We are left with %.2f leva.", budget - total);
        else
            System.out.printf("We need %.2f leva for our actors.", total - budget);
    }
}
