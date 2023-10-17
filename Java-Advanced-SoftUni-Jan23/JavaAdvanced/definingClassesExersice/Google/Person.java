package JavaAdvanced.definingClassesExersice.Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private List<Parents> parentList;
    private List<Children> childrenList;
    private List<Pokemon> pokemonList;
    private Car car;

    public Person(String name) {
        this.name = name;
        this.parentList = new ArrayList<>();
        this.childrenList = new ArrayList<>();
        this.pokemonList = new ArrayList<>();
        this.company = new Company();
        this.car = new Car();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addParent(String name, String date) {
        Parents parent = new Parents(name, date);
        this.parentList.add(parent);
    }

    public void addChild(String name, String date) {
        Children child = new Children(name, date);
        this.childrenList.add(child);
    }

    public void setCar(String name, int speed) {

        this.car.setName(name);
        this.car.setSpeed(speed);
    }

    public void setCompany(String name, String dept, Double salary) {

        this.company.setName(name);
        this.company.setDepartment(dept);
        this.company.setSalary(salary);
    }

    public void addPokemon(String name, String type) {
        Pokemon pokemon = new Pokemon(name, type);
        this.pokemonList.add(pokemon);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()).append(System.lineSeparator());
        sb.append("Company:").append(System.lineSeparator());
        if (this.company.getName() != null) {
            sb.append(this.company.getName()).append(" ").append(this.company.getDepartment()).append(" ");
            String salary = String.format("%.2f", this.company.getSalary());
            sb.append(salary).append(System.lineSeparator());
        }
        sb.append("Car:").append(System.lineSeparator());
        if (this.car.getName() != null) {
            sb.append(this.car.getName()).append(" ").append(this.car.getSpeed()).append(System.lineSeparator());
        }
        sb.append("Pokemon:").append(System.lineSeparator());
        if (this.pokemonList.size() > 0)
            this.pokemonList.forEach(e -> sb.append(e.getName()).append(" ").append(e.getType()).append(System.lineSeparator()));
        sb.append("Parents:").append(System.lineSeparator());
        if (this.parentList.size() > 0)
            this.parentList.forEach(e -> sb.append(e.getName()).append(" ").append(e.getDate()).append(System.lineSeparator()));
        sb.append("Children:").append(System.lineSeparator());
        if (this.childrenList.size() > 0)
            this.childrenList.forEach(e -> sb.append(e.getName()).append(" ").append(e.getDate()).append(System.lineSeparator()));
        return sb.toString();
    }
}
