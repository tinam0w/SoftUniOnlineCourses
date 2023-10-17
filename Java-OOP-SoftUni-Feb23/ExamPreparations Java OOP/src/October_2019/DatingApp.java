package October_2019;

import java.util.*;

public class DatingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input1 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> males = new ArrayDeque<>();
        Arrays.stream(input1).forEach(males::push);

        Deque<Integer> females = new ArrayDeque<>();
        Arrays.stream(input2).forEach(females::offer);

        int matches = 0;
        while (!males.isEmpty() && !females.isEmpty()){
            int female = females.poll();
            int male = males.pop();

            if (male <= 0){
                females.push(female); continue;
            }
            if (female <= 0){
                males.push(male); continue;
            }

            if (male % 25 == 0){
                males.pop(); continue;
            } else if (female % 25 == 0) {
                females.poll(); continue;
            }

            if (male != female){
                males.offer(male - 2);
            } else {
                matches++;
            }

        }

        System.out.println("Matches: " + matches);
        if (males.isEmpty()){
            System.out.println("Males left: none");
        } else {
            System.out.print("Males left: ");
            List<String> toPrint = new ArrayList<>();
            males.forEach(e -> toPrint.add(e + ""));
            System.out.println(String.join(", ", toPrint));
        }

        if (females.isEmpty()){
            System.out.println("Females left: none");
        } else {
            System.out.print("Females left: ");
            List<String> toPrint = new ArrayList<>();
            females.forEach(e -> toPrint.add(e + ""));
            System.out.println(String.join(", ", toPrint));
        }
    }
}
