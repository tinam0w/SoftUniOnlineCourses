package JavaAdvanced.SersAndMapsExercise;

import java.util.*;

public class legendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int shards = 0;
        int fragments = 0;
        int motes = 0;
        Map<String, Integer> allStuffMap = new TreeMap<>();
        String inputLine = scanner.nextLine().toLowerCase();
        List<String> input = Arrays.stream(inputLine.split("\\s+")).toList();
        for (String item : input) {
            if (item.equals("shards")) {
                shards += Integer.parseInt(input.get(input.indexOf(item) - 1));
            } else if (item.equals("fragments")) {
                fragments += Integer.parseInt(input.get(input.indexOf(item) - 1));
            } else if (item.equals("motes")) {
                motes += Integer.parseInt(input.get(input.indexOf(item) - 1));
            }
            int current = Integer.parseInt(input.get(input.indexOf(item) - 1));
            allStuffMap.putIfAbsent(item, 0);
            allStuffMap.put(item, allStuffMap.get(item) + current);
        }

        if (shards >= 250){
            System.out.println("Shadowmourne obtained!");
            allStuffMap.put("shards", allStuffMap.get("shards") - 250);
        } else if (fragments >= 250) {
            System.out.println("Valanyr  obtained!");
            allStuffMap.put("fragments", allStuffMap.get("fragments") - 250);
        } else if (motes >= 250) {
            System.out.println("Dragonwrath  obtained!");
            allStuffMap.put("motes", allStuffMap.get("motes") - 250);
        }

        allStuffMap.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + ": " + e.getValue());
        });

    }
}
