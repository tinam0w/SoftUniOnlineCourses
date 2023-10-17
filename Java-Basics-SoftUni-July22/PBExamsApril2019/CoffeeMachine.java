package PBExamsApril2019;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        double n = Double.parseDouble(scanner.nextLine());
        double total = 0;

        if (drink.equals("Espresso")){
            switch (sugar){
                case "Without":
                    total = (n * 0.9) * 0.65;
                    break;
                case "Normal":
                    total = n;
                    break;
                case "Extra":
                    total = n * 1.2;
                    break;
            }
            if (n >= 5) total = total * 0.75;
        } else if (drink.equals("Cappuccino")) {
            switch (sugar){
                case "Without":
                    total = n * 0.65;
                    break;
                case "Normal":
                    total = n * 1.2;
                    break;
                case "Extra":
                    total = n * 1.6;
                    break;
            }
        } else if (drink.equals("Tea")) {
            switch (sugar){
                case "Without":
                    total = (n * 0.5) * 0.65;
                    break;
                case "Normal":
                    total = n * 0.6;
                    break;
                case "Extra":
                    total = n * 0.7;
                    break;
            }
    }
     if (total > 15)
         total = total * 0.8;

     System.out.printf("You bought %.0f cups of %s for %.2f lv.", n, drink, total);
}
}
