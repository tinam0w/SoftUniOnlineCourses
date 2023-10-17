package JavaAdvanced.StacksAndQueueExersice;

import java.util.ArrayDeque;
import java.util.Scanner;

public class simpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder text = new StringBuilder();
        ArrayDeque<String> commandsStack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String command = scanner.nextLine();
            if (command.startsWith("1")){
                commandsStack.push(text.toString());
                String toAdd = command.split("\\s+")[1];
                text.append(toAdd);
            } else if (command.startsWith("2")) {
                commandsStack.push(text.toString());
                int toErase = Integer.parseInt(command.split("\\s+")[1]);
                text.delete((text.length() - toErase),text.length());
            } else if (command.startsWith("3")) {
                int index = Integer.parseInt(command.split("\\s+")[1]);
                System.out.println(text.charAt(index - 1));
            } else if (command.equals("4")) {
                if (!commandsStack.isEmpty())
                    text = new StringBuilder(commandsStack.pop());
            }
        }
    }
}
