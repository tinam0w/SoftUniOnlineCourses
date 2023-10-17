package FinalExam05;

import java.util.Scanner;

public class ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String activationKey1 = scanner.nextLine();
        StringBuilder activationKey2 = new StringBuilder(activationKey1);
        String commands = scanner.nextLine();
        while (!commands.equals("Generate")){
            String[] command = commands.split(">>>");
            switch (command[0]){
                case "Contains":
                    String substring = command[1];
                    if (activationKey1.contains(substring)){
                        System.out.println(activationKey1 + " contains " + substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    int start = Integer.parseInt(command[2]);
                    int end = Integer.parseInt(command[3]);
                    switch (command[1]){
                        case "Upper":
                            String replaceUp = activationKey2.substring(start, end).toUpperCase();
                            activationKey2.replace(start, end, replaceUp);

                        break;
                        case "Lower":
                            String replaceLow = activationKey2.substring(start, end).toLowerCase();
                            activationKey2.replace(start, end, replaceLow);
                            break;
                    }
                    System.out.println(activationKey2);
                    break;
                case "Slice":
                    int startIndex = Integer.parseInt(command[1]);
                    int endIndex = Integer.parseInt(command[2]);
                    activationKey2.delete(startIndex, endIndex);
                    System.out.println(activationKey2);
                    break;
            }
            activationKey1 = activationKey2.toString();
            commands = scanner.nextLine();
        }
        System.out.println("Your activation key is: " + activationKey2);
    }
}
