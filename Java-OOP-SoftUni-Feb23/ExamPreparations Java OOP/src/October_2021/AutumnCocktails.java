package October_2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class AutumnCocktails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input1 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> ingredients = new ArrayDeque<>();
        Arrays.stream(input1).forEach(ingredients::offer);

        Deque<Integer> freshness = new ArrayDeque<>();
        Arrays.stream(input2).forEach(freshness::push);

        int pearSour = 0, theHarvest = 0, appleHinny = 0, highFashion = 0;

        while (!ingredients.isEmpty() && !freshness.isEmpty()){
            if (ingredients.peek() <= 0){
                ingredients.poll();
                continue;
            }
            int currentIngredient = ingredients.poll();
            int currentFreshness = freshness.pop();
            int mix = currentIngredient * currentFreshness;
            switch (mix){
                case 150: pearSour++; break;
                case 250: theHarvest++; break;
                case 300: appleHinny++; break;
                case 400: highFashion++; break;
                default: ingredients.offer(currentIngredient + 5);
            }
        }

        if (pearSour > 0 && theHarvest > 0 && appleHinny > 0 && highFashion > 0){
            System.out.println("It's party time! The cocktails are ready!");
        } else {
            System.out.println("What a pity! You didn't manage to prepare all cocktails.");
        }

        if (!ingredients.isEmpty()){
            int sum = 0;
            for (Integer num : ingredients) {
                sum += num;
            }
            System.out.println("Ingredients left: " + sum);
        }

        if (appleHinny > 0) System.out.println("# Apple Hinny --> " + appleHinny);
        if (highFashion > 0) System.out.println("# High Fashion --> " + highFashion);
        if (pearSour > 0) System.out.println("# Pear Sour --> " + pearSour);
        if (theHarvest > 0) System.out.println("# The Harvest --> " + theHarvest);
    }
}
