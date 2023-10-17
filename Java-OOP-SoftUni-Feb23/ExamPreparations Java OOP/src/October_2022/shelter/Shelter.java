package October_2022.shelter;

import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Animal> data;
    private int capacity;

    public Shelter(int capacity) {
        this.data = new ArrayList<>();
        this.capacity = capacity;
    }

    public void add(Animal animal) {
        if (this.capacity > 0) {
            data.add(animal);
            this.capacity--;
        }
    }

    public boolean remove(String name) {
        if (!this.data.isEmpty()) {
            for (Animal animal : this.data) {
                if (animal.getName().equals(name)) {
                    this.capacity++;
                    return data.remove(animal);
                }
            }
        }
        return false;
    }

    public Animal getAnimal(String name, String caretaker) {
        if (!this.data.isEmpty()) {
            for (Animal animal : this.data) {
                if (animal.getName().equals(name)
                && animal.getCaretaker().equals(caretaker)){
                    return animal;
                }
            }
        }
        return null;
    }

    public Animal getOldestAnimal(){
        Animal oldestAnimal = new Animal();
        if (!this.data.isEmpty()){
            for (Animal animal : this.data) {
                if (animal.getAge() > oldestAnimal.getAge()){
                    oldestAnimal = animal;
                }
            }
        }
        return oldestAnimal;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The October_2022.shelter has the following animals:");
        sb.append(System.lineSeparator());
        if (!this.data.isEmpty()){
            for (Animal animal : this.data) {
                sb.append(animal.getName()).append(" ").append(animal.getCaretaker());
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
