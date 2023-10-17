package June_2021.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private int capacity;
    private List<Pet> data;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet){
        if (this.capacity > 0){
            this.data.add(pet);
            this.capacity--;
        }
    }

    public boolean remove(String name){
        if (!this.data.isEmpty()){
            for (Pet pet : this.data) {
                if (pet.getName().equals(name)){
                    capacity++;
                    return this.data.remove(pet);
                }
            }
        }
        return false;
    }

    public Pet getPet(String name, String owner){
        if (!this.data.isEmpty()){
            for (Pet pet : this.data) {
                if (pet.getName().equals(name)
                && pet.getOwner().equals(owner)){
                    return pet;
                }
            }
        }
        return null;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append("The grooming salon has the following clients:");
        sb.append(System.lineSeparator());
        if (!this.data.isEmpty()){
            for (Pet pet : this.data) {
                sb.append(pet.getName()).append(" ").append(pet.getOwner());
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}
