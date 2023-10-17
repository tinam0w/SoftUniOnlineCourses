package IteratorsExersice.StackIterator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack stack = new Stack();
        String[] command = scanner.nextLine().replace(",", "").split("\\s+");
        while (!command[0].equals("END")) {
            if (command[0].equals("Push")) {
                for (int i = 1; i < command.length; i++) {
                    int num = Integer.parseInt(command[i]);
                    stack.add(num);
                }
            } else if (command[0].equals("Pop")) {
                if (stack.isEmpty()) {
                    System.out.println("No elements");
                } else {
                    stack.pop();
                }
            }
            command = scanner.nextLine().replace(",", "").split("\\s+");
        }
        stack.forEach(System.out::println);
        stack.forEach(System.out::println);
    }
}
