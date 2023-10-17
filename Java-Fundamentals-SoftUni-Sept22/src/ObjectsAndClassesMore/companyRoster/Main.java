package ObjectsAndClassesMore.companyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String inputLine = scanner.nextLine();
            Employee employee = new Employee();

            employee.setName(inputLine.split("\\s+")[0]);
            employee.setSalary(Double.parseDouble(inputLine.split("\\s+")[1]));
            employee.setPosition(inputLine.split("\\s+")[2]);
            employee.setDepartment(inputLine.split("\\s+")[3]);

            if (inputLine.split("\\s+").length == 5) {
                if (inputLine.split("\\s+")[4].contains("@")) {
                    employee.setEmail(inputLine.split("\\s+")[4]);
                } else {
                    employee.setAge(Integer.parseInt(inputLine.split("\\s+")[4]));
                }
            }

            if (inputLine.split("\\s+").length == 6) {
                employee.setEmail(inputLine.split("\\s+")[4]);
                employee.setAge(Integer.parseInt(inputLine.split("\\s+")[5]));
            }

            employeeList.add(employee);
        }

        //List<String> departmentList = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        //същото е като:
        List<String> departmentList = new ArrayList<>();
        for (Employee employee : employeeList) {
            departmentList.add(employee.getDepartment());
        }

        List<Department> departments = new ArrayList<>();
        for (String dep : departmentList){
            departments.add(new Department(dep, employeeList.stream().filter(employee -> employee.getDepartment().equals(dep)).collect(Collectors.toList())));
        }
        //сортираме по средна заплата:
        departments.sort(Comparator.comparing(Department::getAvgSalary).reversed());
        //запазваме отделението с най-висока средна заплата:
        Department department = departments.get(0);
        //сортираме отделението с най-високо заплащане:
        department.getEmployee().sort(Comparator.comparingDouble(Employee::getSalary).reversed());

        System.out.printf("Highest Average Salary: %s%n", department.getName());
        for (Employee employee : department.getEmployee()) {
            System.out.printf("%s %.2f %s %d%n", employee.getName(), employee.getSalary(), employee.getEmail(), employee.getAge());
        }
    }
}