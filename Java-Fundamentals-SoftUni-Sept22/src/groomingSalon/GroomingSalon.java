package groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {

    //полета:
    private int capacity;
    private List<Pet> data = new ArrayList<>();

    //конструктор:
    public GroomingSalon(int capacity) {
        this.capacity = capacity;
    }

    //метод Add:
    public void add(Pet pet) {
        if (this.capacity > 0) {
            data.add(pet);
            this.capacity--;
        }
    }

    //метод Remove:
    public boolean remove(String name) {
        for (Pet pet : data) {
            if (pet.getName().equals(name)) {
                data.remove(pet);
                return true;
            }
        }
        return false;
    }

    //метод getPet:
    public Pet getPet(String name, String owner) {
        for (Pet pet : data) {
            if (pet.getName().equals(name) && pet.getOwner().equals(owner)) {
                return pet;
            }
        }
        return null;
    }

    //метод getCount:
    public int getCount() {
        return data.size();
    }

    //метод getStatistics:
    public String getStatistics() {
        String begin = String.format("The grooming salon has the following clients:%n");
        String pets = "";
        for (Pet pet : data) {
            pets += String.format("%s %s%n", pet.getName(), pet.getOwner());
        }
        return begin + pets;
    }

}
