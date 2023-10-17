package PBExamsMarch2020;

import java.util.Scanner;

public class EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int qnty = Integer.parseInt(scanner.nextLine());
        double total = 0;

        switch (fruit){
            case "Watermelon":
                if (size.equals("small")){
                    total = qnty * 56 * 2;
                } else if (size.equals("big")) {
                    total = qnty * 28.7 * 5;
                }
                break;
            case "Mango":
                if (size.equals("small")){
                    total = qnty * 36.66 * 2;
                } else if (size.equals("big")) {
                    total = qnty * 19.6 * 5;
                }
                break;
            case "Pineapple":
                if (size.equals("small")){
                    total = qnty * 42.1 * 2;
                } else if (size.equals("big")) {
                    total = qnty * 24.8 * 5;
                }
                break;
            case "Raspberry":
                if (size.equals("small")){
                    total = qnty * 20 * 2;
                } else if (size.equals("big")) {
                    total = qnty * 15.2 * 5;
                }
                break;
        }
        if (total >= 400 && total <= 1000)
            total = total * 0.85;
        else if (total > 1000)
            total = total * 0.5;

        System.out.printf("%.2f lv.", total);
    }
}
