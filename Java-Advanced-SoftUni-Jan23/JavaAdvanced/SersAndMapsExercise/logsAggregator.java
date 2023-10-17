package JavaAdvanced.SersAndMapsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class logsAggregator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> nameTime = new TreeMap<>();
        Map<String, List<String>> nameIp = new TreeMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if (!nameTime.containsKey(input[1])){
                nameTime.put(input[1], 0);
                nameIp.put(input[1],new ArrayList<>());
            }
            nameTime.put(input[1], nameTime.get(input[1]) + Integer.parseInt(input[2]));
            if (!nameIp.get(input[1]).contains(input[0]))
                nameIp.get(input[1]).add(input[0]);
        }

        for (Map.Entry<String, Integer> entry : nameTime.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue());
            for (Map.Entry<String, List<String>> listEntry : nameIp.entrySet()) {
                if (listEntry.getKey().equals(entry.getKey())){
                    Collections.sort(listEntry.getValue());
                    System.out.print(" [");
                    System.out.print(String.join(", ", listEntry.getValue()));
                    System.out.print("]\n");
                }
            }
        }

    }
}
