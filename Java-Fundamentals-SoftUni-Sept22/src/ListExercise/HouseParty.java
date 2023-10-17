package ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());
        List<String> guests = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            String[] command = scanner.nextLine().split(" ");
            if (command[2].equals("going!")) {
                if (guests.contains(command[0]))
                    System.out.println(command[0] + " is already in the list!");
                else
                    guests.add(command[0]);
            } else {
                if (guests.contains(command[0]))
                    guests.remove(command[0]);
                else
                    System.out.println(command[0] + " is not in the list!");
            }
        }
        for (String name : guests) {
            System.out.println(name);
        }
    }
}
