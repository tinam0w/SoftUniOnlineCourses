package CondStatAdvancedLab;

import java.util.Scanner;

public class FruitOrVege {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    //  "fruit" са banana, apple, kiwi, cherry, lemon и grapes
    //  "vegetable" са tomato, cucumber, pepper и carrot
    // 	Всички останали са "unknown"

        String product = scanner.nextLine();

        switch (product){
            case ("banana"):
            case ("apple"):
            case ("kiwi"):
            case ("cherry"):
            case ("lemon"):
            case ("grapes"):
                System.out.println("fruit");
                break;
            case ("tomato"):
            case ("cucumber"):
            case ("pepper"):
            case ("carrot"):
                System.out.println("vegetable");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
