package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] initialLootArr = input.split("\\|");

        String command = scanner.nextLine();
        while (!command.equals("Yohoho!")) {
            String[] commandParts = command.split(" ");

            if (commandParts[0].equals("Loot")) {
                for (int i = 1; i < commandParts.length; i++) {
                    boolean alreadyContained = false;
                    for (int j = 0; j < initialLootArr.length; j++) {
                        if (commandParts[i].equals(initialLootArr[j])) {
                            alreadyContained = true;
                            break;
                        }
                    }
                    if (!alreadyContained) {
                        String newInitial = commandParts[i] + " " + String.join(" ", initialLootArr);
                        initialLootArr = newInitial.split(" ");
                    }
                }

            } else if (commandParts[0].equals("Drop")) {
                int index = Integer.parseInt(commandParts[1]);

                if (index >= 0 && index <= initialLootArr.length - 1) {
                    String droppedItem = initialLootArr[index];
                    for (int i = index; i < initialLootArr.length - 1; i++) {
                        initialLootArr[i] = initialLootArr[i + 1];
                    }
                    initialLootArr[initialLootArr.length - 1] = droppedItem;
                }

            } else if (commandParts[0].equals("Steal")) {
                int count = Integer.parseInt(commandParts[1]);

                if (count >= 0 && count < initialLootArr.length) {

                    for (int i = 0; i < count; i++) {
                        System.out.print(initialLootArr[initialLootArr.length - count + i]);
                        if (i != count - 1)
                            System.out.print(", ");
                    }

                    String[] newInitialArr = new String[initialLootArr.length - count];
                    for (int i = 0; i < newInitialArr.length; i++) {
                        newInitialArr[i] = initialLootArr[i];
                    }
                    initialLootArr = newInitialArr;
                } else if (count >= 0) {
                    for (int i = 0; i < initialLootArr.length; i++) {
                        System.out.print(initialLootArr[i]);
                        if (i != initialLootArr.length - 1)
                            System.out.print(", ");
                    }
                    initialLootArr = new String[0];
                }
                System.out.println();
            }

            command = scanner.nextLine();
        }

        String count = String.join("",initialLootArr);
        int charCounter = 0;
            for (int i = 0; i < initialLootArr.length; i++) {
                charCounter+= initialLootArr[i].length();
            }
            double averageGain = (charCounter * 1.0) / initialLootArr.length;
            if (charCounter > 0)
                System.out.printf("Average treasure gain: %.2f pirate credits.%n", averageGain);
            else
                System.out.println("Failed treasure hunt.");
    }
}
