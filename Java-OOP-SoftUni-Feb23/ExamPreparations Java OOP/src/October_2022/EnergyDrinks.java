package October_2022;

import java.util.*;
import java.util.stream.Collectors;

public class EnergyDrinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] caffeineArr = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        Deque<Integer> caffeine = new ArrayDeque<>();
        for (int num : caffeineArr) {
            caffeine.push(num);
        }

        int[] drinksArr = Arrays.stream(scanner.nextLine().split(",\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        Deque<Integer> drinks = new ArrayDeque<>();
        for (int num : drinksArr) {
            drinks.offer(num);
        }

        int totalCaffeine = 0;
        while (!caffeine.isEmpty() && !drinks.isEmpty()) {
            int result = caffeine.peek() * drinks.peek();

            if (result + totalCaffeine <= 300) {
                totalCaffeine += result;
                caffeine.pop();
                drinks.poll();
            } else {
                caffeine.pop();
                drinks.offer(drinks.poll());

                if (totalCaffeine > 30) {
                    totalCaffeine -= 30;
                } else {
                    totalCaffeine = 0;
                }
            }
        }

        if (!drinks.isEmpty()) {
            System.out.print("Drinks left: ");
            List<String> integers = drinks.stream()
                    .map(e -> e + "")
                    .collect(Collectors.toList());
            System.out.println(String.join(", ", integers));
        } else {
            System.out.println("At least Stamat wasn't exceeding the maximum caffeine.");
        }
        System.out.println("Stamat is going to sleep with " + totalCaffeine + " mg caffeine.");
    }
}
