package AssociativeArraysExercise;

import java.util.*;

public class SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> userPoints = new LinkedHashMap<>();
        Map<String, Integer> lngCount = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("exam finished")) {
            if (!input.contains("banned")) {
                String user = input.split("-")[0];
                String lng = input.split("-")[1];
                int points = Integer.parseInt(input.split("-")[2]);
                userPoints.putIfAbsent(user, points);
                if (userPoints.get(user) < points) {
                    userPoints.put(user, points);
                }
                lngCount.putIfAbsent(lng, 0);
                lngCount.put(lng, lngCount.get(lng) + 1);
            } else {
                String user = input.split("-")[0];
                userPoints.remove(user);
            }
            input = scanner.nextLine();
        }
        System.out.println("Results:");
        userPoints.entrySet().forEach(e -> System.out.println(e.getKey() + " | " + e.getValue()));
        System.out.println("Submissions:");
        lngCount.entrySet().forEach(e -> System.out.println(e.getKey() + " - " + e.getValue()));
    }
}
