package FinalExamDec2022;

import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);
        String[] commands = scanner.nextLine().split("\\s+");
        while (!commands[0].equals("Done")) {
            switch (commands[0]) {
                case "Change":
                    input = text.toString().replace(commands[1], commands[2]);
                    text = new StringBuilder(input);
                    System.out.println(text);
                    break;
                case "Includes":
                    if (input.contains(commands[1])) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "End":
                    if (input.endsWith(commands[1])){
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    input = input.toUpperCase();
                    text = new StringBuilder(input);
                    System.out.println(text);
                    break;
                case "FindIndex":
                    int index = text.indexOf(commands[1]);
                    System.out.println(index);
                    break;
                case "Cut":
                    int start = Integer.parseInt(commands[1]);
                    int end = Integer.parseInt(commands[1]) + Integer.parseInt(commands[2]);
                    String sub = input.substring(start, end);
                    text.delete(start, end);
                    input = text.toString();
                    System.out.println(sub);
                    break;
            }
            commands = scanner.nextLine().split("\\s+");
        }
        System.out.println();
    }
}
