package AssociativeArraysMore;

import java.util.*;
import java.util.stream.Stream;

public class Ranking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contestsPasswordMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end of contests")) {
            String contest = input.split(":")[0];
            String password = input.split(":")[1];
            contestsPasswordMap.putIfAbsent(contest, password);
            input = scanner.nextLine();
        }

        Map<String, Map<String, Integer>> userCoursePoints = new TreeMap<>();
        String input1 = scanner.nextLine();
        while (!input1.equals("end of submissions")) {
            String contest = input1.split("=>")[0];
            if (contestsPasswordMap.containsKey(contest)) {
                String password = input1.split("=>")[1];
                if (contestsPasswordMap.get(contest).equals(password)) {
                    String user = input1.split("=>")[2];
                    int points = Integer.parseInt(input1.split("=>")[3]);

                    Map<String, Integer> contestPoints = new LinkedHashMap<>();
                    contestPoints.put(contest, points);

                    if (!userCoursePoints.containsKey(user)) {
                        userCoursePoints.put(user, contestPoints);
                    } else {
                        if (!userCoursePoints.get(user).containsKey(contest)) {
                            userCoursePoints.get(user).put(contest, points);
                        } else {
                            userCoursePoints.get(user).put(contest, Math.max(points, userCoursePoints.get(user).get(contest)));
                        }
                    }
                }
            }
            input1 = scanner.nextLine();
        }

        String bestUser = "";
        int bestPoints = 0;
        for (Map.Entry<String, Map<String, Integer>> entry : userCoursePoints.entrySet()) {
            int sumPoints = 0;
            for (Map.Entry<String, Integer> integerEntry : entry.getValue().entrySet()) {
                sumPoints += integerEntry.getValue();
            }
            if (sumPoints > bestPoints){
                bestPoints = sumPoints;
                bestUser = entry.getKey();
            }
        }
        System.out.println("Best candidate is " + bestUser + " with total " + bestPoints + " points.");
        System.out.println("Ranking:");

//        for (Map.Entry<String, Map<String, Integer>> entry : userCoursePoints.entrySet()) {
//            for (Map.Entry<String, Integer> integerEntry : entry.getValue().entrySet()) {
//                entry.getValue().entrySet().stream().sorted((f, s) -> s.getValue() - f.getValue());
//            }
//        }


        //not my code!!
        userCoursePoints.forEach((key, value) -> {
                    System.out.printf("%s%n", key);
                    value.entrySet().stream().
                            sorted((f, s) -> s.getValue() - f.getValue()).
                            forEach(i -> System.out.printf("#  %s -> %d%n", i.getKey(), i.getValue()));
                });

//        userCoursePoints.forEach((key, value) -> {
//            value.entrySet().stream().sorted((f, s) -> s.getValue() - f.getValue());
//        });
//
//        System.out.println("Ranking:");
//        userCoursePoints.entrySet().forEach(e -> {
//            System.out.println(e.getKey());
//            e.getValue().entrySet().forEach(entry -> {
//                System.out.println("#  " + entry.getKey() + " -> " + entry.getValue());
//            });
//        });

    }
}
