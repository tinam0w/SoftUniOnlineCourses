package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inventory = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while(!inputLine.equals("Craft!")){
            String[] commandLine = inputLine.split(" - ");
            String command = commandLine[0];

            switch (command){
                case "Collect":
                    String addItem = commandLine[1];
                    if (!inventory.contains(addItem)){
                        inventory.add(addItem);
                    }
                    break;
                case "Drop":
                    String removeItem = commandLine[1];
                    inventory.remove(removeItem);
                    break;
                case "Combine Items":
                    String[] items = commandLine[1].split(":");
                    String oldItem = items[0];
                    String newItem = items[1];
                    if (inventory.contains(oldItem)){
                        int indexOldItem = inventory.indexOf(oldItem);
                        inventory.add(indexOldItem + 1, newItem);
                    }
                    break;
                case "Renew":
                    String item = commandLine[1];
                    if (inventory.contains(item)){
                        inventory.remove(item);
                        inventory.add(item);
                    }
                    break;
            }
            inputLine = scanner.nextLine();
        }
        System.out.println(String.join(", ", inventory));
    }
}
