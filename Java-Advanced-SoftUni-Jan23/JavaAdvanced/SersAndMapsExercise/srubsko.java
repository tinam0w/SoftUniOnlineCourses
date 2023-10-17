package JavaAdvanced.SersAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class srubsko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> map = new LinkedHashMap<>();

        Pattern pattern = Pattern.compile("(?<name>[A-Za-z ]+) @(?<place>[A-Za-z ]+) (?<price>\\d+) (?<count>\\d+)");

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String singer = matcher.group("name");
                String place = matcher.group("place");
                int price = Integer.parseInt(matcher.group("price"));
                int count = Integer.parseInt(matcher.group("count"));
                int totalPrice = price * count;

                map.putIfAbsent(place, new LinkedHashMap<>());
                if (!map.get(place).containsKey(singer)) {
                    map.get(place).put(singer, totalPrice);
                } else {
                    int current = map.get(place).get(singer);
                    map.get(place).put(singer, current + totalPrice);
                }
            }
            input = scanner.nextLine();
        }

        map.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey());
            e.getValue().entrySet().stream().
                    sorted((s1,s2) -> s2.getValue().compareTo(s1.getValue())).
                    forEach(s -> {
                        System.out.println("#  " + s.getKey() + " -> " + s.getValue());
                    });
        });

    }
}
