package December_2021.aquarium;

import java.util.HashMap;
import java.util.Map;

public class Aquarium {
    private String name;
    private int capacity;
    private int size;
    private Map<String, Fish> fishInPool;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new HashMap<>();
    }

    public int getFishInPool() {
        return this.fishInPool.size();
    }

    public void add(Fish fish) {
        if (this.capacity > 0) {
            if (!this.fishInPool.containsKey(fish.getName())) {
                this.fishInPool.put(fish.getName(), fish);
                this.capacity--;
            }
        }
    }

    public boolean remove(String name) {
        if (this.fishInPool.containsKey(name)) {
            this.fishInPool.remove(name);
            this.capacity++;
            return true;
        }
        return false;
    }

    public Fish findFish(String name){
        if (this.fishInPool.containsKey(name)){
            return this.fishInPool.get(name);
        }
        return null;
    }

    public String report(){
        StringBuilder sb = new StringBuilder();
        sb.append("Aquarium: ").append(getName());
        sb.append(" ^ ").append("Size: ").append(getSize()).append(System.lineSeparator());
        if (!this.fishInPool.isEmpty()){
            this.fishInPool.forEach((k, v) -> sb.append(v).append(System.lineSeparator()));
        }
        return sb.toString();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }
}
