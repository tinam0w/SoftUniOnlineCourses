package FundMidExam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FriendListMaintenance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> allFriends = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        List<String> blacklisted = new ArrayList<>();
        String input = scanner.nextLine();
        int blacklist = 0;
        int lost = 0;
        while (!input.equals("Report")) {
            String[] commands = input.split(" ");
            switch (commands[0]) {
                case "Blacklist":
                    String name = commands[1];
                    if (allFriends.contains(name)) {
                        System.out.println(name + " was blacklisted.");
                        allFriends.set(allFriends.indexOf(name), "Blacklisted");
                        blacklist++;
                    } else
                        System.out.println(name + " was not found.");
                    break;
                case "Error":
                    int index = Integer.parseInt(commands[1]);
                    if (index >= 0 && index <= allFriends.size() - 1) {
                        String nameError = allFriends.get(index);
                        if (!nameError.equals("Blacklisted")) {
                            if (!nameError.equals("Lost")) {
                                System.out.println(nameError + " was lost due to an error.");
                                allFriends.set(index, "Lost");
                                lost++;
                            }
                        }
                    }
                    break;
                case "Change":
                    int indexChange = Integer.parseInt(commands[1]);
                    String newName = commands[2];
                    if (indexChange >= 0 && indexChange <= allFriends.size() - 1) {
                        String currentName = allFriends.get(indexChange);
                        allFriends.set(indexChange, newName);
                        System.out.println(currentName + " changed his username to " + newName + ".");
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.println("Blacklisted names: " + blacklist);
        System.out.println("Lost names: " + lost);
        for (String item : allFriends) {
            System.out.print(item + " ");
        }
    }
}
