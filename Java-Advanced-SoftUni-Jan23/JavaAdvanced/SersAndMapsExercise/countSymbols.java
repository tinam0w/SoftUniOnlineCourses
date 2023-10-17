package JavaAdvanced.SersAndMapsExercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Character, Integer> map = new TreeMap<>();
        String text = scanner.nextLine();
        for (char symbol : text.toCharArray()) {
            if (!map.containsKey(symbol))
                map.put(symbol, 0);
            map.put(symbol, map.get(symbol) + 1);
        }
        map.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + ": " + e.getValue() + " time/s");
        });
    }
}
