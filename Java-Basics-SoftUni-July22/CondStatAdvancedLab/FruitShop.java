package CondStatAdvancedLab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double qnty = Double.parseDouble(scanner.nextLine());
        double price = 0;
        boolean isValid = true;

        if (day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday")
                || day.equals("Thursday") || day.equals("Friday")) {
            if (fruit.equals("banana")) price = qnty * 2.5;
            else if (fruit.equals("apple")) price = qnty * 1.2;
            else if (fruit.equals("orange")) price = qnty * 0.85;
            else if (fruit.equals("grapefruit")) price = qnty * 1.45;
            else if (fruit.equals("kiwi")) price = qnty * 2.7;
            else if (fruit.equals("pineapple")) price = qnty * 5.5;
            else if (fruit.equals("grapes")) price = qnty * 3.85;
            else isValid = false;
        } else if (day.equals("Saturday") || day.equals("Sunday")) {
            if (fruit.equals("banana")) price = qnty * 2.7;
            else if (fruit.equals("apple")) price = qnty * 1.25;
            else if (fruit.equals("orange")) price = qnty * 0.9;
            else if (fruit.equals("grapefruit")) price = qnty * 1.6;
            else if (fruit.equals("kiwi")) price = qnty * 3;
            else if (fruit.equals("pineapple")) price = qnty * 5.6;
            else if (fruit.equals("grapes")) price = qnty * 4.2;
            else isValid=false;
        } else isValid = false;

        if (isValid)
            System.out.printf("%.2f", price);
        else
            System.out.println("error");
    }

        }


