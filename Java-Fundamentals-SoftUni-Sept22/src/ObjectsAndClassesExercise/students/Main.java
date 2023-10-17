package ObjectsAndClassesExercise.students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            String firstName = input.split(" ")[0];
            String lastName = input.split(" ")[1];
            double grade = Double.parseDouble(input.split(" ")[2]);
            Student student = new Student(firstName,lastName, grade);
            studentList.add(student);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
