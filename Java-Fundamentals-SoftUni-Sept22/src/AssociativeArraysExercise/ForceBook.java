package AssociativeArraysExercise;

import java.util.*;

public class ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains(" | ")) {
                String user = input.split("\\s+\\|\\s+")[1];
                String group = input.split("\\s+\\|\\s+")[0];
                map.putIfAbsent(group, new ArrayList<>());
                boolean isExist = false;
                for (List<String> users : map.values()) {
                    if (users.contains(user)){
                        isExist = true;
                        break;
                    }
                }
                if (!isExist)
                    map.get(group).add(user);
            } else if (input.contains(" -> ")) {
                String user = input.split("\\s+->\\s+")[0];
                String group = input.split("\\s+->\\s+")[1];
                map.entrySet().forEach(entry -> entry.getValue().remove(user));
                if (map.containsKey(group)){
                    map.get(group).add(user);
                } else {
                    map.put(group, new ArrayList<>());
                    map.get(group).add(user);
                }
                System.out.printf("%s joins the %s side!%n", user, group);
            }
            input = scanner.nextLine();
        }

        map.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(e -> {
                    System.out.printf("Side: %s, Members: %d%n", e.getKey(), e.getValue().size());
                    e.getValue().forEach(user -> System.out.println("! " + user));
                });

    }
}
