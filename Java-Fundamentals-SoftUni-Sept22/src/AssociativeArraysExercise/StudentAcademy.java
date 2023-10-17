package AssociativeArraysExercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            String name = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(name)){
                studentsMap.put(name, new ArrayList<>());
            }
            studentsMap.get(name).add(grade);
        }

        Map<String, Double> averageGradeMap = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            double averageGrade = getAvgGrade(entry.getValue());
            if (averageGrade >= 4.5)
                averageGradeMap.put(entry.getKey(), averageGrade);
        }

        averageGradeMap.entrySet().forEach(e -> System.out.printf("%s -> %.2f%n", e.getKey(), e.getValue()));

    }

    public static double getAvgGrade (List<Double> gradeList){
        double sum = 0;
        for (Double grade : gradeList) {
            sum += grade;
        }
        return sum / gradeList.size();
    }
}
