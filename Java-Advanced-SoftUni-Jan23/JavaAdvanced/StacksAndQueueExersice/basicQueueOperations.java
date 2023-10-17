package JavaAdvanced.StacksAndQueueExersice;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class basicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); //бр. за добавяне
        int s = scanner.nextInt(); //бр. за махане
        int x = scanner.nextInt(); //дали го има
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            stack.offer(scanner.nextInt());
        }

        for (int i = 1; i <= s; i++) {
            stack.poll();
        }

        if(stack.contains(x)){
            System.out.println("true");
        } else {
            if (stack.isEmpty())
                System.out.println(0);
            else
                System.out.println(Collections.min(stack));
        }

    }
}
