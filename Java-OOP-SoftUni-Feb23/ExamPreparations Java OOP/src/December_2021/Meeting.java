package December_2021;

import java.util.*;
import java.util.stream.Collectors;

public class Meeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input1 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> males = new ArrayDeque<>();
        for (int num : input1) {
            males.push(num);
        }

        int[] input2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> females = new ArrayDeque<>();
        for (int num : input2) {
            females.offer(num);
        }

        int matches = 0;
        while (!males.isEmpty() && !females.isEmpty()) {
            if (males.peek() <= 0){
                males.pop();
                continue;
            }
            if (females.peek() <= 0){
                females.poll();
                continue;
            }

            if (males.peek() % 25 == 0) {
                males.pop();
                males.pop();
                continue;
            }
            if (females.peek() % 25 == 0) {
                females.poll();
                females.poll();
                continue;
            }

            if (!males.isEmpty() && !females.isEmpty()) {
                if (males.peek() == females.peek()) {
                    males.pop();
                    females.poll();
                    matches++;
                } else {
                    females.poll();
                    males.push(males.pop() - 2);
                }
            }
        }

        System.out.println("Matches: " + matches);
        System.out.print("Males left: ");
        if (males.isEmpty()) {
            System.out.println("none");
        } else {
            List<String> male = males.stream().map(e -> e + "").collect(Collectors.toList());
            System.out.println(String.join(", ", male));
        }
        System.out.print("Females left: ");
        if (females.isEmpty()) {
            System.out.println("none");
        } else {
            List<String> female = females.stream().map(e -> e + "").collect(Collectors.toList());
            System.out.println(String.join(", ", female));
        }
    }
}
