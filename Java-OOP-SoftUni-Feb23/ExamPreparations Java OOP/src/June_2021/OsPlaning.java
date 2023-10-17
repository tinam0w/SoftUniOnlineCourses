package June_2021;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class OsPlaning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input1 = Arrays.stream(scanner.nextLine().split(",\\s+")).mapToInt(Integer::parseInt).toArray();
        int[] input2 = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Deque<Integer> tasks = new ArrayDeque<>();
        Arrays.stream(input1).forEach(tasks::push);

        Deque<Integer> treads = new ArrayDeque<>();
        Arrays.stream(input2).forEach(treads::offer);

        int taskToKill = Integer.parseInt(scanner.nextLine());

        boolean isKilled = false;
        int killerTread = 0;
        while (!tasks.isEmpty() && !treads.isEmpty()){
            int currentTask = tasks.peek();
            int currentTread = treads.peek();
            if (currentTask == taskToKill){
                tasks.pop();
                killerTread = currentTread;
                isKilled = true;
                break;
            }
            if (currentTread >= currentTask) {
                treads.poll();
                tasks.pop();
            } else {
                treads.poll();
            }
        }

        System.out.printf("Thread with value %d killed task %d%n", killerTread, taskToKill);
        if (!treads.isEmpty()){
            treads.forEach(e -> System.out.print(e + " "));
        }
    }
}
