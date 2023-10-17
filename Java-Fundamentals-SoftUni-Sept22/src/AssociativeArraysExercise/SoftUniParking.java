package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> systemMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            if (input[0].equals("register")) {
                String user = input[1];
                String plate = input[2];
                if (systemMap.containsKey(user)) {
                    if (systemMap.get(user).equals(plate))
                        System.out.printf("ERROR: already registered with plate number %s%n", systemMap.get(user));
                } else {
                    systemMap.put(user, plate);
                    System.out.printf("%s registered %s successfully%n", user, plate);
                }
            } else {
                String user = input[1];
                if (!systemMap.containsKey(user)) {
                    System.out.printf("ERROR: user %s not found%n", user);
                } else {
                    systemMap.remove(user);
                    System.out.printf("%s unregistered successfully%n", user);
                }
            }
        }
        systemMap.entrySet().forEach(e -> System.out.printf("%s => %s%n", e.getKey(), e.getValue()));
    }
}
