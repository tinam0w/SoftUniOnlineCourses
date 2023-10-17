package ObjectsAndClassesMore.companyRoster;

import java.util.List;

public class Department {
    private String name;
    public List<Employee> employee;
    public double avgSalary;

    public Department(String name, List<Employee> employee){
        this.name = name;
        this.employee = employee;
        this.avgSalary = employee.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
    }

    public String getName(){
        return this.name;
    }

    public double getAvgSalary(){
        return this.avgSalary;
    }

    public List<Employee> getEmployee(){
        return employee;
    }
}
