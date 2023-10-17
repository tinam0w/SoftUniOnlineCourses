package FundamentalsBasicsExercise;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        String input = scanner.nextLine();
        while (!input.equals("Start")){
            double coin = Double.parseDouble(input);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2)
                sum += coin;
            else
                System.out.printf("Cannot accept %.2f%n", coin);
            input = scanner.nextLine();
        }

        String product = scanner.nextLine();
        while (!product.equals("End")){
            switch (product){
                case "Nuts":
                    sum = sum - 2;
                    if (sum >= 0)
                        System.out.println("Purchased Nuts");
                    else {
                        System.out.println("Sorry, not enough money");
                        sum = sum + 2;
                    }
                    break;
                case "Water":
                    sum = sum - 0.7;
                    if (sum >= 0)
                        System.out.println("Purchased Water");
                    else {
                        System.out.println("Sorry, not enough money");
                        sum = sum + 0.7;
                    }
                    break;
                case "Crisps":
                    sum = sum - 1.5;
                    if (sum >= 0)
                        System.out.println("Purchased Crisps");
                    else {
                        System.out.println("Sorry, not enough money");
                        sum = sum + 1.5;
                    }
                    break;
                case "Soda":
                    sum = sum - 0.8;
                    if (sum >= 0)
                        System.out.println("Purchased Soda");
                    else {
                        System.out.println("Sorry, not enough money");
                        sum = sum + 0.8;
                    }
                    break;
                case "Coke":
                    sum = sum - 1;
                    if (sum >= 0)
                        System.out.println("Purchased Coke");
                    else {
                        System.out.println("Sorry, not enough money");
                        sum = sum + 1;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            product = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
    }
}
