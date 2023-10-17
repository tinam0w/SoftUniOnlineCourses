package EncapsulationExersice.PizzaCalories;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaInputParts = scanner.nextLine().split("\\s+");
        Pizza pizza = initializePizza(pizzaInputParts);
        if (pizza == null) return;

        String[] doughInputParts = scanner.nextLine().split("\\s+");
        Dough dough = initializeDough(doughInputParts);
        if (dough == null) return;
        pizza.setDough(dough);

        String toppingInput = scanner.nextLine();
        while (!toppingInput.equals("END")){
            Topping topping = initializeTopping(toppingInput);
            if (topping == null) return;
            pizza.addTopping(topping);

            toppingInput = scanner.nextLine();
        }

        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }

    private static Topping initializeTopping(String toppingInput) {
        Topping topping = null;
        String[] toppingInputParts = toppingInput.split("\\s+");
        try {
            topping = new Topping(toppingInputParts[1], Double.parseDouble(toppingInputParts[2]));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        return topping;
    }

    private static Dough initializeDough(String[] doughInputParts) {
        Dough dough = null;
        try {
            dough = new Dough(doughInputParts[1],
                    doughInputParts[2],
                    Double.parseDouble(doughInputParts[3]));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        return dough;
    }

    private static Pizza initializePizza(String[] pizzaInputParts) {
        Pizza pizza = null;
        try {
            pizza = new Pizza(pizzaInputParts[1], Integer.parseInt(pizzaInputParts[2]));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        return pizza;
    }
}
