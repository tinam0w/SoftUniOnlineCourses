package AssociativeArraysExercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> coursesMap = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String course = input.split("\\s+:\\s+")[0];
            String student = input.split("\\s+:\\s+")[1];
            coursesMap.putIfAbsent(course, new ArrayList<>());
            coursesMap.get(course).add(student);
            input = scanner.nextLine();
        }
        coursesMap.entrySet().forEach(e -> {
            System.out.println(e.getKey() + ": " + e.getValue().size());
            for (String name : e.getValue()) {
                System.out.println("-- " + name);
            }
        });
    }
}
