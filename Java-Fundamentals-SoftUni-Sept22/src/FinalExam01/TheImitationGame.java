package FinalExam01;

import java.util.Scanner;

public class TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder input1 = new StringBuilder(input);

        String[] instruction = scanner.nextLine().split("\\|");
        while (!instruction[0].equals("Decode")){
            switch (instruction[0]){
                case "Move":
                    int numLetters = Integer.parseInt(instruction[1]);
                    String toMove = input.substring(0, numLetters);
                    input1.delete(0, numLetters);
                    input1.append(toMove);
                    input = input1.toString();
                    break;
                case "Insert":
                    int index = Integer.parseInt(instruction[1]);
                    String value = instruction[2];
                    input1.insert(index, value);
                    input = input1.toString();
                    break;
                case "ChangeAll":
                    String substring = instruction[1];
                    String replacement = instruction[2];
                    input = input.replace(substring, replacement);
                    input1 = new StringBuilder(input);
                    break;
            }
            instruction = scanner.nextLine().split("\\|");
        }
        System.out.println("The decrypted message is: " + input);
    }
}
