package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> minorMap = new LinkedHashMap<>();
        String resource = scanner.nextLine();
        while (!resource.equals("stop")){
            int qnty = Integer.parseInt(scanner.nextLine());
            minorMap.putIfAbsent(resource, 0);
            minorMap.put(resource, minorMap.get(resource) + qnty);
            resource = scanner.nextLine();
        }

        minorMap.entrySet().forEach(e -> System.out.printf("%s -> %d%n", e.getKey(), e.getValue()));
    }
}
