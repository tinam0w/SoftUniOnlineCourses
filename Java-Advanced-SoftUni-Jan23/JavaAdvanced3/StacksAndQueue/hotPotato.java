package JavaAdvanced.StacksAndQueue;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class hotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> kids = new ArrayDeque<>();
        String[] names = scanner.nextLine().split(" ");
        int steps = Integer.parseInt(scanner.nextLine());
        Collections.addAll(kids, names);

        while (kids.size() > 1){
            for (int i = 1; i < steps; i++){
                kids.offer(kids.poll());
            }
            String removedKid = kids.poll();
            System.out.println("Removed " + removedKid);
        }
        System.out.println("Last is " + kids.poll());
    }
}
