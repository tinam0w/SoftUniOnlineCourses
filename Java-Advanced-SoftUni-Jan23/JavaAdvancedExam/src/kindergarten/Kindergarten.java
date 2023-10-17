package kindergarten;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Kindergarten {
    private String name;
    private int capacity;
    private List<Child> registry;

    public Kindergarten(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.registry = new ArrayList<>();
    }

    public boolean addChild(Child child) {
        if (this.capacity > 0){
            this.registry.add(child);
            this.capacity--;
            return true;
        }
        return false;
    }

    public boolean removeChild(String firstName){
        if (!this.registry.isEmpty()){
            for (Child child : this.registry) {
                if (child.getFirstName().equals(firstName)){
                    this.capacity++;
                    return this.registry.remove(child);
                }
            }
        }
        return false;
    }

    public int getChildrenCount(){
        return this.registry.size();
    }

    public Child getChild(String firstName){
        if (!this.registry.isEmpty()){
            for (Child child : this.registry) {
                if (child.getFirstName().equals(firstName)){
                    return child;
                }
            }
            return null;
        }
        return null;
    }

    public String registryReport(){
        StringBuilder sb = new StringBuilder();
        sb.append("Registered children in ").append(getName()).append(":").append(System.lineSeparator());
        if (!this.registry.isEmpty()) {
            this.registry.sort(Comparator.comparing(Child::getLastName));
            this.registry.sort(Comparator.comparing(Child::getFirstName));
            this.registry.sort(Comparator.comparing(Child::getAge));
            for (Child child : this.registry) {
                sb.append("--").append(System.lineSeparator());
                sb.append(child).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }
}
