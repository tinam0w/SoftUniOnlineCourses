package JavaAdvanced.StacksAndQueueExersice;

        import java.util.*;
        import java.util.stream.Collectors;
        import java.util.stream.IntStream;

public class poisonousPlants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            stack.push(scanner.nextInt());
        }

        int days = 0;

        while (true) {
            int stackSize = stack.size();
            ArrayDeque<Integer> spareStack = new ArrayDeque<>();

            while (stack.size() > 1) {
                int lastElement = stack.pop();
                if (lastElement < stack.peek()) {
                    spareStack.push(lastElement);
                }
            }
            spareStack.push(stack.pop());
            if (spareStack.size() == stackSize){
                break;
            } else {
                days++;
                stack = new ArrayDeque<>(spareStack);
            }
        }
        System.out.println(days - 1);
    }
}

