package AssociativeArraysMore;

import java.util.*;
import java.util.stream.Collectors;

public class Judge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> map = new LinkedHashMap<>();
        Map<String, Integer> userPoints = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("no more time")) {
            String[] tokens = input.split("\\s+->\\s+");
            String user = tokens[0];
            String contest = tokens[1];
            int points = Integer.parseInt(tokens[2]);

            if (!map.containsKey(contest)) {
                map.put(contest, new LinkedHashMap<>());
                map.get(contest).put(user, points);
                userPoints.putIfAbsent(user, 0);
                userPoints.put(user, userPoints.get(user) + points);
            } else {
                if (map.get(contest).containsKey(user)) {
                    map.get(contest).put(user, Math.max(map.get(contest).get(user), points));
                    userPoints.put(user, map.get(contest).get(user));
                } else {
                    map.get(contest).put(user, points);
                    userPoints.putIfAbsent(user, 0);
                    userPoints.put(user, userPoints.get(user) + points);
                }
            }
            input = scanner.nextLine();
        }

//        for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue().size() + " participants");
//            int count = 1;
//            for (Map.Entry<String, Integer> integerEntry : entry.getValue().entrySet()) {
//                System.out.println(count + ". " + integerEntry.getKey() + " <::> " + integerEntry.getValue());
//                count++;
//            }
//        }
//
//        System.out.println("Individual standings:");
//        int count = 1;
//        for (Map.Entry<String, Integer> entry : userPoints.entrySet()) {
//            System.out.println(count + ". " + entry.getKey() + " -> " + entry.getValue());
//        }


        //not my code!!:
        Comparator<Map.Entry<String, Integer>> mapComparator = Map.Entry.<String, Integer>
                        comparingByValue(Comparator.reverseOrder())
                .thenComparing(Map.Entry.comparingByKey());

        map.forEach((contest, participants) -> {
            System.out.printf("%s: %d participants%n", contest, participants.size());
            final int[] index = {0};
            participants.entrySet()
                    .stream()
                    .sorted(mapComparator)
                    .forEach(participant -> {
                        System.out.printf("%d. %s <::> %d%n", ++index[0], participant.getKey(), participant.getValue());
                    });
        });

        System.out.println("Individual standings:");
        final int[] index = {0};
        map.values()
                .stream()
                .flatMap(m -> m.entrySet().stream())
                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.summingInt(Map.Entry::getValue)))
                .entrySet()
                .stream()
                .sorted(mapComparator)
                .forEach(participant -> {
                    System.out.printf("%d. %s -> %d%n", ++index[0], participant.getKey(), participant.getValue());
                });
    }
}
