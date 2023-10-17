package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        String[] command = scanner.nextLine().split("\\s+");
        while (!command[0].equals("3:1")) {
            if (command[0].equals("merge")) {
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);

                if (endIndex < 0 || startIndex > inputList.size() - 1) {
                    command = scanner.nextLine().split("\\s+");
                    continue;
                }
                if (startIndex < 0)
                    startIndex = 0;
                if (endIndex > inputList.size() - 1)
                    endIndex = inputList.size() - 1;

                String toAdd = "";
                for (int i = endIndex; i >= startIndex; i--) {
                    toAdd = inputList.get(i) + toAdd;
                }
                for (int i = endIndex; i >= startIndex; i--) {
                    inputList.remove(i);
                }
                inputList.add(startIndex, toAdd);

            } else if (command[0].equals("divide")) {
                int index = Integer.parseInt(command[1]);
                int part = Integer.parseInt(command[2]);
                if (part == 0){
                    command = scanner.nextLine().split("\\s+");
                    continue;
                }
                String toDivide = inputList.get(index);
                inputList.remove(index);
                List<String> toAdd = stringToDivide(toDivide, part);
                inputList.addAll(index, toAdd);
            }
            command = scanner.nextLine().split("\\s+");
        }

        for (String item : inputList) {
            System.out.print(item + " ");
        }
    }

    public static List<String> stringToDivide(String toDivide, int parts) {
        int len = toDivide.length();
        int chars = len / parts;
        List<String> toAdd = new ArrayList<>();

            for (int i = 0; i < len; i = i + chars) {
                if (i == len - 1) {
                    String part = toDivide.substring(i);
                    toAdd.add(part);
                } else {
                    String part = toDivide.substring(i, i + chars);
                    toAdd.add(part);
                }
            }
        return toAdd;
    }
}
