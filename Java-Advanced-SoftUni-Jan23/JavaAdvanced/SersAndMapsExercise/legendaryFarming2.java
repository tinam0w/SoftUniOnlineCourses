package JavaAdvanced.SersAndMapsExercise;

import java.util.*;
import java.util.stream.Collectors;

public class legendaryFarming2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> allStuff = new TreeMap<>();
        Map<String, Integer> stuffs = new TreeMap<>();
        stuffs.put("motes", 0);
        stuffs.put("fragments", 0);
        stuffs.put("shards", 0);
        int shards = 0;
        int fragments = 0;
        int motes = 0;

        boolean isMotes = false;
        boolean isShards = false;
        boolean isfragments = false;
        while (!isfragments && !isShards && !isMotes) {
            String input = scanner.nextLine().toLowerCase();
            List<String> inputLine = new ArrayList<>(Arrays.stream(input.split("\\s+")).collect(Collectors.toList()));

            for (int i = 1; i < inputLine.size(); i = i + 2) {
                int current = Integer.parseInt(inputLine.get(i - 1));

                if (inputLine.get(i).equals("shards")) {
                    shards += current;
                    stuffs.put("shards", shards);
                    isShards = shards >= 250;
                    if (isShards) break;
                } else if (inputLine.get(i).equals("fragments")) {
                    fragments += current;
                    stuffs.put("fragments", fragments);
                    isfragments = fragments >= 250;
                    if (isfragments) break;
                } else if (inputLine.get(i).equals("motes")) {
                    motes += current;
                    stuffs.put("motes", motes);
                    isMotes = motes >= 250;
                    if (isMotes) break;
                } else {
                    allStuff.putIfAbsent(inputLine.get(i), 0);
                    allStuff.put(inputLine.get(i), allStuff.get(inputLine.get(i)) + current);
                }
            }
        }
        if (isShards) {
            System.out.println("Shadowmourne obtained!");
            stuffs.put("shards", stuffs.get("shards") - 250);
        } else if (isfragments) {
            System.out.println("Valanyr obtained!");
            stuffs.put("fragments", stuffs.get("fragments") - 250);
        } else if (isMotes) {
            System.out.println("Dragonwrath obtained!");
            stuffs.put("motes", stuffs.get("motes") - 250);
        }

        stuffs.entrySet().stream().sorted((s1, s2) -> s2.getValue().compareTo(s1.getValue())).forEach(e -> {
            System.out.println(e.getKey() + ": " + e.getValue());
        });

        if (!allStuff.isEmpty()) {
            allStuff.entrySet().stream().forEach(e ->
                    System.out.println(e.getKey() + ": " + e.getValue()));
        }

    }
}
