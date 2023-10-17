package JavaAdvanced.StacksAndQueueLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class browserhistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        ArrayDeque<String> history2 = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (history.size() <= 1) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    history2.push(history.pop());
                    System.out.println(history.peek());
                }
            } else if (input.equals("forward")) {
                if (history2.isEmpty()) {
                    System.out.println("no next URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    history.push(history2.pop());
                    System.out.println(history.peek());
                }
            } else {
                history2.clear();
                history.push(input);
                System.out.println(input);
            }
            input = scanner.nextLine();
        }
    }
}
