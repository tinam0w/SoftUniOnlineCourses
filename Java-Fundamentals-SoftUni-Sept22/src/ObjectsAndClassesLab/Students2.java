package ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2 {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return this.town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public void setTown(String town){
            this.town = town;
        }

        public void setAge(int age){
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        List<Student> studentsList = new ArrayList<>();
        while (!inputLine.equals("end")) {
            String[] currentStudentArr = inputLine.split("\\s+");

            if (isStudentExisting(studentsList, currentStudentArr[0], currentStudentArr[1])) {
                Student currentStudent = getStudent(studentsList, currentStudentArr[0], currentStudentArr[1]);
                currentStudent.setTown(currentStudentArr[3]);
                currentStudent.setAge(Integer.parseInt(currentStudentArr[2]));
            } else {
                Student currentStudent = new Student(currentStudentArr[0], currentStudentArr[1], Integer.parseInt(currentStudentArr[2]), currentStudentArr[3]);
                studentsList.add(currentStudent);
            }

            inputLine = scanner.nextLine();
        }
        String homeTown = scanner.nextLine();

        for (Student item : studentsList) {
            if (item.getTown().equals(homeTown)) {
                System.out.printf("%s %s is %d years old%n", item.getFirstName(), item.getLastName(), item.getAge());
            }
        }
    }

    public static boolean isStudentExisting(List<Student> studentList, String firstName, String lastName) {
        for (Student item : studentList) {
            if (item.getFirstName().equals(firstName) && item.getLastName().equals(lastName))
                return true;
        }
        return false;
    }

    public static Student getStudent(List<Student> studentList, String firstname, String lastName) {
        Student existingStudent = null;

        for (Student item : studentList) {
            if (item.getFirstName().equals(firstname) && item.getLastName().equals(lastName)) {
                existingStudent = item;
            }
        }
        return existingStudent;
    }

}
