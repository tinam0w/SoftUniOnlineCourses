package June_2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class ChocolateTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] input1 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Deque<Double> milk = new ArrayDeque<>();
        for (Double number : input1) {
            milk.offer(number);
        }

        double[] input2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Deque<Double> cocoa = new ArrayDeque<>();
        for (Double number : input2) {
            cocoa.push(number);
        }

        int milkChocolate = 0, darkChocolate = 0, bakingChocolate = 0;

        while (!milk.isEmpty() && !cocoa.isEmpty()) {
            double currentCocoa = cocoa.pop();
            double currentMilk = milk.poll();
            double mix = (currentCocoa / (currentMilk + currentCocoa)) * 100;
            if (mix == 30) {
                milkChocolate++;
            } else if (mix == 50) {
                darkChocolate++;
            } else if (mix == 100) {
                bakingChocolate++;
            } else {
                milk.offer(currentMilk + 10);
            }
        }

        if (milkChocolate > 0 && darkChocolate > 0 && bakingChocolate > 0) {
            System.out.println("It’s a Chocolate Time. All chocolate types are prepared.");
        } else {
            System.out.println("Sorry, but you didn't succeed to prepare all types of chocolates.");
        }

        if (bakingChocolate > 0)
            System.out.println("# Baking Chocolate --> " + bakingChocolate);
        if (darkChocolate > 0)
            System.out.println("# Dark Chocolate --> " + darkChocolate);
        if (milkChocolate > 0)
            System.out.println("# Milk Chocolate --> " + milkChocolate);

    }
}
