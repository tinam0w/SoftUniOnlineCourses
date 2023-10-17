package JavaAdvanced.StacksAndQueueExersice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class reverseNumbersStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String num : numbers) {
            stack.push(num);
        }
        for (String num : stack) {
            System.out.print(num + " ");
        }
    }
}
