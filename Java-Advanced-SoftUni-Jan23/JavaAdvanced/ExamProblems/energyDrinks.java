package JavaAdvanced.ExamProblems;

import java.util.*;
import java.util.stream.Collectors;

public class energyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> caffeineList = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> drinksList = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        ArrayDeque<Integer> caffeine = new ArrayDeque<>(caffeineList);
        ArrayDeque<Integer> drinks = new ArrayDeque<>(drinksList);
        int drankCaffeine = 0;

        while (drinks.size() > 0 && caffeine.size() > 0) {
            int currentDrink = caffeine.peekLast() * drinks.peekFirst();
            if (currentDrink + drankCaffeine < 300) {
                drankCaffeine += currentDrink;
                caffeine.pollLast();
                drinks.pollFirst();
            } else {
                caffeine.pollLast();
                int spareDrink = drinks.pollFirst();
                drinks.offer(spareDrink);
                if (drankCaffeine - 30 >= 0){
                    drankCaffeine -= 30;
                } else {
                    drankCaffeine = 0;
                }
            }
        }

        if (drinks.size() > 0){
            System.out.print("Drinks left: ");
            System.out.println(String.join(", ", drinks.toString().replace("[", "").replace("]", "")));
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }
        System.out.printf("Stamat is going to sleep with %d mg caffeine.%n", drankCaffeine);
    }
}
