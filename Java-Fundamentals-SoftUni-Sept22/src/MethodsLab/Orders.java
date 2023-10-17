package MethodsLab;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        totalOrderPrint(product, quantity);
    }

    public static void totalOrderPrint(String product, int qnty){
        double result = 0;
        switch (product){
            case "coffee":
                result = qnty * 1.5;
                break;
            case "water":
                result = qnty;
                break;
            case "coke":
                result = qnty * 1.4;
                break;
            case "snacks":
                result = qnty * 2;
                break;
        }
        System.out.printf("%.2f", result);
    }
}
