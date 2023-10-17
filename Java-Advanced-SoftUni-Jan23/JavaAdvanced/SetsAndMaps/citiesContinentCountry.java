package JavaAdvanced.SetsAndMaps;

import java.util.*;

public class citiesContinentCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, List<String>>> map = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String continent = input.split(" ")[0];
            String country = input.split(" ")[1];
            String capital = input.split(" ")[2];

            if (!map.containsKey(continent)) {
                map.put(continent, new LinkedHashMap<>());
            }
            if (!map.get(continent).containsKey(country)) {
                map.get(continent).put(country, new ArrayList<>());
            }
            map.get(continent).get(country).add(capital);
        }

        map.entrySet().stream().forEach(entry -> {
            System.out.println(entry.getKey() + ":");
            entry.getValue().entrySet().stream().forEach(e -> {
                System.out.print("  " + e.getKey() + " -> ");
                System.out.println(String.join(", ", e.getValue()));
            });
        });

    }
}