package AssociativeArraysExercise;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> map = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String company = input.split("\\s+->\\s+")[0];
            String id = input.split("\\s+->\\s+")[1];
            map.putIfAbsent(company, new ArrayList<>());
            if (!map.get(company).contains(id)){
                map.get(company).add(id);
            }
            input = scanner.nextLine();
        }
        map.entrySet().forEach(e -> {
            System.out.println(e.getKey());
            for (String id : e.getValue()) {
                System.out.println("-- " + id);
            }
        });
    }
}
