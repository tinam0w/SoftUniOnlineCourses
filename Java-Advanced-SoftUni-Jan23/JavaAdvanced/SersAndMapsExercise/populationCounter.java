package JavaAdvanced.SersAndMapsExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class populationCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> map = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("report")){
            String city = input.split("\\|")[0];
            String country = input.split("\\|")[1];
            int population = Integer.parseInt(input.split("\\|")[2]);
            if (!map.containsKey(country)){
                map.put(country, new LinkedHashMap<>());
            }
            map.get(country).put(city, population);
            input = scanner.nextLine();
        }

        map.entrySet().stream().sorted((e1,e2) -> {
            long total1 = map.get(e1.getKey()).entrySet().stream().mapToLong(Map.Entry::getValue).sum();
            long total2 = map.get(e2.getKey()).entrySet().stream().mapToLong(Map.Entry::getValue).sum();
            return Long.compare(total2, total1);
        }).forEach( entry -> {
            System.out.print(entry.getKey() + " ");
            StringBuilder builder = new StringBuilder();
            AtomicReference<Long> totalPopulation = new AtomicReference<>((long) 0);
            map.get(entry.getKey()).entrySet().stream().sorted((e1,e2) -> e2.getValue().compareTo(e1.getValue())).
                    forEach( e -> {
                        builder.append(String.format("=>%s: %d%n", e.getKey(), e.getValue()));
                        totalPopulation.updateAndGet(v -> v + e.getValue());
                    });
            System.out.println(String.format("(total population: %s)", totalPopulation.toString()));
            System.out.print(builder.toString());

        });

    }
}
