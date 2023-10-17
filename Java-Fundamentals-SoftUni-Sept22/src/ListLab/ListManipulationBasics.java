package ListLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] commandArr = input.split(" ");
            String command = commandArr[0];

            switch (command) {
                case "Add":
                    int toAdd = Integer.parseInt(commandArr[1]);
                    numList.add(toAdd);
                    break;
                case "Remove":
                    int toRemove = Integer.parseInt(commandArr[1]);
                    numList.remove(Integer.valueOf(toRemove));
                    break;
                case "RemoveAt":
                    int indexRemove = Integer.parseInt(commandArr[1]);
                    numList.remove(indexRemove);
                    break;
                case "Insert":
                    int toInsert = Integer.parseInt(commandArr[1]);
                    int indexInsert = Integer.parseInt(commandArr[2]);
                    numList.add(indexInsert, toInsert);
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
