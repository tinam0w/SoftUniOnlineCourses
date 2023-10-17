package JavaAdvanced.definingClassesExersice.companyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();
        Map<String, List<Double>> departmentMap = new HashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            double salary = Double.parseDouble(data[1]);
            String position = data[2];
            String department = data[3];
            String email = "n/a";
            int age = -1;
            if (data.length == 6) {
                email = data[4];
                age = Integer.parseInt(data[5]);
            } else if (data.length == 5) {
                if (data[4].contains("@")) {
                    email = data[4];
                } else {
                    age = Integer.parseInt(data[4]);
                }
            }
            Employee employee = new Employee(name, salary, position, department, email, age);
            employeeList.add(employee);
            departmentMap.putIfAbsent(department, new ArrayList<>());
            departmentMap.get(department).add(salary);
        }

        Map<String, Double> departmentSalaries = new HashMap<>();
        departmentSalaries = getAverageSalary(departmentMap);

        String topDepartment = getTopDepartment(departmentSalaries);
        System.out.println("Highest Average Salary: " + topDepartment);

        employeeList.sort(Comparator.comparing(Employee::getSalary).reversed());

        for (Employee employee: employeeList) {
            if (employee.getDepartment().equals(topDepartment)){
                System.out.println(employee);
            }
        }
    }

    private static String getTopDepartment(Map<String, Double> departmentSalaries) {
        String name = "";
        double maxAvSalary = 0;
        for (Map.Entry<String, Double> entry : departmentSalaries.entrySet()) {
            if (entry.getValue() > maxAvSalary) {
                maxAvSalary = entry.getValue();
                name = entry.getKey();
            }
        }
        return name;
    }

    private static Map<String, Double> getAverageSalary(Map<String, List<Double>> departmentMap) {
        Map<String, Double> newMap = new HashMap<>();
        for (Map.Entry<String, List<Double>> entry : departmentMap.entrySet()) {
            double avSalary = 0;
            for (Double salary : entry.getValue()) {
                avSalary += salary;
            }
            avSalary = avSalary / entry.getValue().size();
            newMap.put(entry.getKey(), avSalary);
        }
        return newMap;
    }
}
