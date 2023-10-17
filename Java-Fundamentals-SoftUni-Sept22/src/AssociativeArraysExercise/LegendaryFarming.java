package AssociativeArraysExercise;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("shards", 0);
        map.put("fragments", 0);
        map.put("motes", 0);
        Map<String, Integer> junkMap = new LinkedHashMap<>();
        String winMaterial = "";
        boolean isOver = false;

        while (!isOver) {
            String[] input = scanner.nextLine().toLowerCase().split("\\s+");
            for (int i = 0; i < input.length; i++) {
                if (i % 2 != 0) {
                    if (!map.containsKey(input[i])) {
                        junkMap.putIfAbsent(input[i], 0);
                        junkMap.put(input[i], junkMap.get(input[i]) + Integer.parseInt(input[i - 1]));
                    } else {
                        map.put(input[i], map.get(input[i]) + Integer.parseInt(input[i - 1]));
                        for (Map.Entry<String, Integer> entry : map.entrySet()) {
                            if (entry.getValue() >= 250) {
                                winMaterial = entry.getKey();
                                isOver = true;
                                break;
                            }
                        }
                    }
                }
                if (isOver) break;
            }
        }
        String winItem = "";
        switch (winMaterial) {
            case "shards":
                winItem = "Shadowmourne";
                break;
            case "fragments":
                winItem = "Valanyr";
                break;
            case "motes":
                winItem = "Dragonwrath";
                break;
        }
        // the legendary item:
        System.out.println(winItem + " obtained!");
        // the left key materials:
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getKey().equals(winMaterial)) {
                map.put(entry.getKey(), entry.getValue() - 250);
            }
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        // the junk materials:
        junkMap.entrySet().forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }
}
