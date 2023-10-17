package JavaAdvanced.SetsAndMaps;

import java.util.*;

public class academyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double> studentsMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] grades = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
            double avg = 0;
            for (double grade : grades) {
                avg += grade;
            }
            avg = avg / grades.length;
            studentsMap.put(name, avg);
        }
        for (Map.Entry<String, Double> entry : studentsMap.entrySet()) {
            System.out.println(entry.getKey() + " is graduated with " + entry.getValue());
        }
    }
}
