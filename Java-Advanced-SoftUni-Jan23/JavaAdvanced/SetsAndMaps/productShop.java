package JavaAdvanced.SetsAndMaps;

import java.util.*;

public class productShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Double>> shopsMap = new TreeMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Revision")){

            String shop = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);

            if (!shopsMap.containsKey(shop)){
                shopsMap.put(shop, new LinkedHashMap<>());
            }
            shopsMap.get(shop).put(product, price);

            input = scanner.nextLine();
        }

//        for (Map.Entry<String, Map<String, Double>> entry : shopsMap.entrySet()) {
//            System.out.println(entry.getKey() + "->");
//            for (Map.Entry<String, Double> doubleEntry : entry.getValue().entrySet()) {
//                System.out.printf("Product: %s, Price: %.1f%n", doubleEntry.getKey(), doubleEntry.getValue());
//            }
//        }

        shopsMap.entrySet().stream().forEach(e -> {
            System.out.println(e.getKey() + "->");
            e.getValue().entrySet().stream().forEach(entry -> System.out.printf("Product: %s, Price: %.1f%n", entry.getKey(), entry.getValue()));
        });

    }
}
