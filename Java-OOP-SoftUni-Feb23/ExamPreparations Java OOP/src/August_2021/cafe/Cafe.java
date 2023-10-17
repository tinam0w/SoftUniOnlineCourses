package August_2021.cafe;

import java.util.ArrayList;
import java.util.List;

public class Cafe {
    private String name;
    private int capacity;
    private List<Employee> employees;

    public Cafe(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        if (this.capacity > 0){
            this.employees.add(employee);
            this.capacity--;
        }
    }

    public boolean removeEmployee(String name){
        if (!this.employees.isEmpty()){
            for (Employee emp : this.employees) {
                if (emp.getName().equals(name)){
                    capacity++;
                    return employees.remove(emp);
                }
            }
        }
        return false;
    }

    public Employee getOldestEmployee(){
        if (!this.employees.isEmpty()){
            Employee employee = new Employee();
            int maxAge = 0;
            for (Employee emp : this.employees) {
                if (emp.getAge() > maxAge){
                    employee = emp;
                    maxAge = emp.getAge();
                }
            }
            return employee;
        }
        return null;
    }

    public Employee getEmployee(String name){
        if (!this.employees.isEmpty()){
            for (Employee emp : employees) {
                if (emp.getName().equals(name)){
                    return emp;
                }
            }
        }
        return null;
    }

    public int getCount(){
        return this.employees.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("Employees working at Cafe ").append(getName()).append(":").append(System.lineSeparator());
        if (!this.employees.isEmpty()){
            for ( Employee emp : this.employees) {
                sb.append(emp).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }
}
