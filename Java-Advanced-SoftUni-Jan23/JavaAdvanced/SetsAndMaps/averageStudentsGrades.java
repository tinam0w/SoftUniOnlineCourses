package JavaAdvanced.SetsAndMaps;

import java.util.*;

public class averageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsMap = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            if (!studentsMap.containsKey(name)) {
                studentsMap.put(name, new ArrayList<>());
            }
            studentsMap.get(name).add(grade);
        }

        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            double sum = 0;
            for (double grade : entry.getValue()) {
                sum += grade;
            }
            System.out.printf(entry.getKey() + " -> ");
            entry.getValue().forEach(e -> System.out.print(String.format("%.2f", e) + " "));
            System.out.printf("(avg: %.2f)%n", sum/entry.getValue().size());
        }

    }
}
