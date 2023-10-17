package FinalExamDec2022.others;

import java.util.Scanner;

public class DecryptingCommands {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("Finish")){
            switch (command[0]){
                case "Replace":
                    input = input.replace(command[1],command[2]);
                    System.out.println(input);
                    break;
                case "Cut":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]) + 1;
                    if ((index1 >= 0 && index1 < input.length()) && (index2 >= 0 && index2 < input.length())){
                        String substring = input.substring(index1, index2);
                        input = input.replaceFirst(substring, "");
                        System.out.println(input);
                    }else {
                        System.out.println("Invalid indices!");
                    }
                    break;
                case "Make":
                    if (command[1].equals("Upper"))
                        input = input.toUpperCase();
                    else if (command[2].equals("Lower"))
                        input = input.toLowerCase();
                    System.out.println(input);
                    break;
                case "Check":
                    if (input.contains(command[1]))
                        System.out.println("Message contains " + command[1]);
                    else
                        System.out.println("Message doesn't contain " + command[1]);
                    break;
                case "Sum":
                    int ind1 = Integer.parseInt(command[1]);
                    int ind2 = Integer.parseInt(command[2]) + 1;
                    if ((ind1 >= 0 && ind1 < input.length()) && (ind2 >= 0 && ind2 < input.length())){
                        String substring = input.substring(ind1, ind2);
                        int sum = 0;
                        for (char symbol : substring.toCharArray()) {
                            sum += (int) symbol;
                        }
                        System.out.println(sum);
                    }else {
                        System.out.println("Invalid indices!");
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+");
        }
    }
}
