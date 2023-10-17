package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> wagonsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        while (!input.equals("end")) {

            String[] command = input.split(" ");

            if (command[0].equals("Add")) {
                int passengers = Integer.parseInt(command[1]);
                wagonsList.add(wagonsList.size(), passengers);
            } else {
                int passenger = Integer.parseInt(command[0]);
                for (int i = 0; i < wagonsList.size(); i++) {
                    if (wagonsList.get(i) + passenger <= maxCapacity) {
                        wagonsList.set(i, wagonsList.get(i) + passenger);
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        System.out.println(wagonsList.toString().replaceAll("[\\[\\],]", ""));
    }
}
