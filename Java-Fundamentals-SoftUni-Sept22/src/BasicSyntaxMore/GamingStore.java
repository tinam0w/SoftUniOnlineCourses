package FundamentalsBasicMore;

import java.util.Scanner;

public class GamingStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        boolean noMoney = false;
        double spent = 0;

        String game = scanner.nextLine();
        while (!game.equals("Game Time")){
            double price = 0;
            switch (game){
                case "RoverWatch Origins Edition":
                case "OutFall 4":
                    price = 39.99;
                    if (price > budget)
                        System.out.println("Too Expensive");
                    else if (price < budget) {
                        budget -= price;
                        spent += price;
                        System.out.println("Bought " + game);
                    } else {
                        budget -= price;
                        spent += price;
                        System.out.println("Bought " + game);
                        noMoney = true;
                        System.out.println("Out of money!");
                    }
                break;
                case "CS: OG":
                    price = 15.99;
                    if (price > budget)
                        System.out.println("Too Expensive");
                    else if (price < budget) {
                        budget -= price;
                        spent += price;
                        System.out.println("Bought " + game);
                    } else {
                        budget -= price;
                        spent += price;
                        noMoney = true;
                        System.out.println("Bought " + game);
                        System.out.println("Out of money!");
                    }
                    break;
                case "Zplinter Zell":
                    price = 19.99;
                    if (price > budget)
                        System.out.println("Too Expensive");
                    else if (price < budget) {
                        budget -= price;
                        spent += price;
                        System.out.println("Bought " + game);
                    } else {
                        budget -= price;
                        spent += price;
                        noMoney = true;
                        System.out.println("Bought " + game);
                        System.out.println("Out of money!");
                    }
                    break;
                case "Honored 2":
                    price = 59.99;
                    if (price > budget)
                        System.out.println("Too Expensive");
                    else if (price < budget) {
                        budget -= price;
                        spent += price;
                        System.out.println("Bought " + game);
                    } else {
                        budget -= price;
                        spent += price;
                        noMoney = true;
                        System.out.println("Bought " + game);
                        System.out.println("Out of money!");
                    }
                    break;
                case "RoverWatch":
                    price = 29.99;
                    if (price > budget)
                        System.out.println("Too Expensive");
                    else if (price < budget) {
                        budget -= price;
                        spent += price;
                        System.out.println("Bought " + game);
                    } else {
                        budget -= price;
                        spent += price;
                        noMoney = true;
                        System.out.println("Bought " + game);
                        System.out.println("Out of money!");
                    }
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (noMoney)
                break;
            game = scanner.nextLine();
        }
        if (!noMoney)
            System.out.printf("Total spent: $%.2f. Remaining: $%.2f",spent, budget);
    }
}
