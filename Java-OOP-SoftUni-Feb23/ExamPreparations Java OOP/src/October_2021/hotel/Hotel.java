package October_2021.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String name;
    private int capacity;
    private List<Person> roster;

    public Hotel(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void add(Person person){
        if (this.capacity > 0){
            roster.add(person);
            capacity--;
        }
    }

    public boolean remove(String name){
        if (!roster.isEmpty()){
            for (Person person : roster) {
                if (person.getName().equals(name)){
                    capacity++;
                    return roster.remove(person);
                }
            }
        }
        return false;
    }

    public Person getPerson(String name, String hometown){
        if (!this.roster.isEmpty()){
            for (Person person : this.roster) {
                if (person.getName().equals(name) &&
                person.getHometown().equals(hometown)){
                    return person;
                }
            }
        }
        return null;
    }

    public int getCount(){
        return this.roster.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The people in the October_2021.hotel ").append(getName()).append(" are:").append(System.lineSeparator());
        if (!this.roster.isEmpty()){
            for (Person person : this.roster) {
                sb.append(person).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
}
