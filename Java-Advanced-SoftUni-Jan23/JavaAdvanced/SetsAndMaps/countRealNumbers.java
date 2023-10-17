package JavaAdvanced.SetsAndMaps;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Double, Integer> map = new LinkedHashMap<>();
        String[] numbers = scanner.nextLine().split(" ");
        for (String num: numbers) {
            double current = Double.parseDouble(num);

            if (map.containsKey(current)){
                Integer count = map.get(current);
                map.put(current, count + 1);
            } else {
                map.put(current, 1);
            }
        }

        for(Double current: map.keySet()){
            System.out.printf("%.1f -> %d%n", current, map.get(current));
        }



    }
}
