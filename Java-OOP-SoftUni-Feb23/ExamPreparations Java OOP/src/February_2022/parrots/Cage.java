package February_2022.parrots;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private List<Parrot> data;
    private String name;
    private int capacity;

    public Cage(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Parrot parrot){
        if (this.capacity > 0){
            this.data.add(parrot);
            this.capacity--;
        }
    }

    public boolean remove(String name){
        if (this.data.size() > 0){
            for (Parrot parrot : this.data) {
                if (parrot.getName().equals(name)){
                    this.capacity++;
                    return this.data.remove(parrot);
                }
            }
            return false;
        }
        return false;
    }

    public Parrot sellParrot(String name){
        if (this.data.size() > 0){
            for (Parrot parrot : this.data) {
                if (parrot.getName().equals(name)){
                    parrot.setAvailable(false);
                    return parrot;
                }
            }
        }
        return null;
    }

    public List<Parrot> sellParrotBySpecies(String species){
        List<Parrot> listToReturn = new ArrayList<>();
        if (this.data.size() > 0){
            for (Parrot parrot : this.data) {
                if (parrot.getSpecies().equals(species)){
                    listToReturn.add(parrot);
                    parrot.setAvailable(false);
                }
            }
        }
        return listToReturn;
    }

    public int count(){
        return this.data.size();
    }

    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("Parrots available at ").append(getName())
                .append(":").append(System.lineSeparator());
        if (!this.data.isEmpty()){
            for (Parrot parrot : this.data) {
                if (parrot.isAvailable()){
                    sb.append(parrot).append(System.lineSeparator());
                }
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
