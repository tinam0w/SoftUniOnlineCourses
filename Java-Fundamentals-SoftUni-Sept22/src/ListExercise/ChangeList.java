package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "Delete":
                    int element = Integer.parseInt(command[1]);
                    numList.removeIf(e -> e == element);
                    break;
                case "Insert":
                    int elmnt = Integer.parseInt(command[1]);
                    int index = Integer.parseInt(command[2]);
                    if (index >= 0 && index <= numList.size())
                        numList.add(index, elmnt);
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println(numList.toString().replaceAll("[\\[\\],]", ""));
    }
}
