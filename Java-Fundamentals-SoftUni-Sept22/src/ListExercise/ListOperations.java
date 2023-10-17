package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] command = input.split("\\s+");

            switch (command[0]) {
                case "Add":
                    int number = Integer.parseInt(command[1]);
                    // int number = Integer.parseIn(input.split(" ")[1]);
                    numList.add(number);
                    break;
                case "Insert":
                    int num = Integer.parseInt(command[1]);
                    int index = Integer.parseInt(command[2]);
                    if (index >= 0 && index < numList.size())
                        numList.add(index, num);
                    else
                        System.out.println("Invalid index");
                    break;
                case "Remove":
                    int indexRemove = Integer.parseInt(command[1]);
                    if (indexRemove >= 0 && indexRemove < numList.size())
                        numList.remove(indexRemove);
                    else
                        System.out.println("Invalid index");
                    break;
                case "Shift":
                    int countShift = Integer.parseInt(command[2]);
                    if (command[1].equals("left")) {
                        for (int i = 1; i <= countShift ; i++) {
                            int firstNum = numList.get(0);
                            numList.remove(0);
                            numList.add(firstNum);
                        }
                    } else if (command[1].equals("right")) {
                        for (int i = 1; i <= countShift ; i++) {
                            int lastNum = numList.get(numList.size() - 1);
                            numList.remove(numList.size() - 1);
                            numList.add(0, lastNum);
                        }
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
