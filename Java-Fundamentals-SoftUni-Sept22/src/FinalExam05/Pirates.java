package FinalExam05;

import java.util.*;

public class Pirates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<String, List<Integer>> citiesMap = new LinkedHashMap<>();
        while (!input.equals("Sail")) {
            String[] targets = input.split("\\|\\|");
            String city = targets[0];
            int people = Integer.parseInt(targets[1]);
            int gold = Integer.parseInt(targets[2]);
            if (!citiesMap.containsKey(city)) {
                citiesMap.put(city, new ArrayList<>());
                citiesMap.get(city).add(people);
                citiesMap.get(city).add(gold);
            } else {
                citiesMap.get(city).set(0, people + citiesMap.get(city).get(0));
                citiesMap.get(city).set(1, gold + citiesMap.get(city).get(1));
            }
            input = scanner.nextLine();
        }
        String eventsInput = scanner.nextLine();
        while (!eventsInput.equals("End")) {
            String[] event = eventsInput.split("=>");
            if (event[0].equals("Plunder")) {
                String town = event[1];
                int people = Integer.parseInt(event[2]);
                int gold = Integer.parseInt(event[3]);
                System.out.println(town + " plundered! " + gold + " gold stolen, " + people + " citizens killed.");
                citiesMap.get(town).set(0, citiesMap.get(town).get(0) - people);
                citiesMap.get(town).set(1, citiesMap.get(town).get(1) - gold);
                if (citiesMap.get(town).get(0) <= 0 ||
                        citiesMap.get(town).get(1) <= 0) {
                    System.out.println(town + " has been wiped off the map!");
                    citiesMap.remove(town);
                }
            } else if (event[0].equals("Prosper")) {
                String town = event[1];
                int gold = Integer.parseInt(event[2]);
                if (gold < 0) {
                    System.out.println("Gold added cannot be a negative number!");
                } else {
                    citiesMap.get(town).set(1, citiesMap.get(town).get(1) + gold);
                    System.out.println(gold + " gold added to the city treasury. " +
                            town + " now has " + citiesMap.get(town).get(1) + " gold.");
                }
            }
            eventsInput = scanner.nextLine();
        }
        if (citiesMap.size() > 0) {
            System.out.println("Ahoy, Captain! There are " + citiesMap.size() +
                    " wealthy settlements to go to:");
            for (Map.Entry<String, List<Integer>> entry : citiesMap.entrySet()) {
                System.out.println(entry.getKey() + " -> Population: " + entry.getValue().get(0) +
                        " citizens, Gold: " + entry.getValue().get(1) + " kg");
            }
        } else {
            System.out.println("Ahoy, Captain! All targets have been plundered and destroyed!");
        }
    }
}
