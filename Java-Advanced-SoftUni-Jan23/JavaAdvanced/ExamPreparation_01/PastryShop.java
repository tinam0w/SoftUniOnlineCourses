package JavaAdvanced.ExamPreparation_01;

import java.util.*;
import java.util.stream.Collectors;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //WRONG:
        //Deque<Integer> liquids = new ArrayDeque<>(Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList()));
        //Deque<Integer> ingredients = new ArrayDeque<>(Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList()));

        String[] liquidsInput = scanner.nextLine().split("\\s+");
        Deque<Integer> liquids = new ArrayDeque<>();
        for (String liquid : liquidsInput) {
            liquids.offer(Integer.parseInt(liquid));
        }

        String[] ingredientsInput = scanner.nextLine().split("\\s+");
        Deque<Integer> ingredients = new ArrayDeque<>();
        for (String ingredient : ingredientsInput) {
            ingredients.push(Integer.parseInt(ingredient));
        }

        Map<Integer, String> foodsMap = new HashMap<>();
        foodsMap.put(25, "Biscuit");
        foodsMap.put(50, "Cake");
        foodsMap.put(75, "Pastry");
        foodsMap.put(100, "Pie");

        int biscuits = 0, cake = 0, pastry = 0, pie = 0;

        while (!liquids.isEmpty() && !ingredients.isEmpty()) {
            int sum = liquids.poll() + ingredients.peek();
            int ingredient = ingredients.pop() + 3;
            ingredients.push(ingredient);
            for (Map.Entry<Integer, String> entry : foodsMap.entrySet()) {
                if (sum == entry.getKey()) {
                    ingredients.pop();
                    switch (entry.getValue()) {
                        case "Biscuit": biscuits++; break;
                        case "Cake": cake++; break;
                        case "Pastry": pastry++; break;
                        case "Pie": pie++; break;
                    }
                }
            }
        }

        if (biscuits > 0 && cake > 0 && pastry > 0 && pie > 0) {
            System.out.println("Great! You succeeded in cooking all the food!");
        } else {
            System.out.println("What a pity! You didn't have enough materials to cook everything.");
        }

        System.out.print("Liquids left: ");
        if (liquids.isEmpty()) {
            System.out.println("none");
        } else {
            System.out.println(liquids.toString().replaceAll("\\[|\\]", ""));
        }

        System.out.print("Ingredients left: ");
        if (ingredients.isEmpty()) {
            System.out.println("none");
        } else {
            System.out.println(ingredients.toString().replaceAll("\\[|\\]", ""));
        }

        System.out.printf("Biscuit: %d\nCake: %d\nPie: %d\nPastry: %d\n",
                biscuits, cake, pie, pastry);

    }
}