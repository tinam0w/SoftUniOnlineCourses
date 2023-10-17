package FinalExam03;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();
        StringBuilder msg = new StringBuilder(message);
        String command = scanner.nextLine();
        while (!command.equals("Reveal")){
            String[] tokens = command.split(":\\|:");
            switch (tokens[0]){
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);
                    msg.insert(index, " ");
                    message = msg.toString();
                    System.out.println(msg);
                    break;
                case "Reverse":
                    String substring = tokens[1];
                    if (message.contains(substring)){
                        StringBuilder toReverse = new StringBuilder(substring);
                        String toAdd = toReverse.reverse().toString();
                        message = message.replaceFirst(Pattern.quote(substring), "") + toAdd;
                        msg = new StringBuilder(message);
                        System.out.println(message);
                    } else
                        System.out.println("error");
                    break;
                case "ChangeAll":
                    String subString = tokens[1];
                    String replace = tokens[2];
                    message = message.replace(subString, replace);
                    msg = new StringBuilder(message);
                    System.out.println(message);
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.println("You have a new text message: " + message);
    }
}
