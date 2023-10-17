package AssociativeArraysExercise;

import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> map = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("buy")) {
            String product = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            double qnty = Double.parseDouble(input.split(" ")[2]);
            if (!map.containsKey(product)) {
                map.putIfAbsent(product, new ArrayList<>());
                map.get(product).add(price);
                map.get(product).add(qnty);
            } else {
                map.get(product).set(1, map.get(product).get(1) + qnty);
                if (map.get(product).get(0) != price)
                    map.get(product).set(0, price);
            }
            input = scanner.nextLine();
        }
        map.entrySet().forEach(entry -> {
            System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue().get(0) * entry.getValue().get(1));
        });
    }
}
