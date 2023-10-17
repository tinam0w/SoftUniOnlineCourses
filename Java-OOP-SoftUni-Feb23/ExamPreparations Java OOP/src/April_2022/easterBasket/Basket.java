package April_2022.easterBasket;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;

    public Basket(String material, int capacity) {
        this.material = material;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void addEgg(Egg egg) {
        if (this.capacity > 0) {
            this.data.add(egg);
            this.capacity--;
        }
    }

    public boolean removeEgg(String color) {
        if (!this.data.isEmpty()) {
            for (Egg egg : this.data) {
                if (egg.getColor().equals(color)) {
                    this.capacity++;
                    return this.data.remove(egg);
                }
            }
        }
        return false;
    }

    public Egg getStrongestEgg() {
        if (!this.data.isEmpty()) {
            Egg eggToReturn = new Egg();
            int maxStrength = 0;
            for (Egg egg : data) {
                if (egg.getStrength() > maxStrength) {
                    eggToReturn = egg;
                    maxStrength = egg.getStrength();
                }
            }
            return eggToReturn;
        }
        return null;
    }

    public Egg getEgg(String color) {
        if (!this.data.isEmpty()) {
            Egg eggToReturn = new Egg();
            for (Egg egg : data) {
                if (egg.getColor().equals(color)) {
                    eggToReturn = egg;
                    break;
                }
            }
            return eggToReturn;
        }
        return null;
    }

    public int getCount() {
        return this.data.size();
    }

    public String report() {
        StringBuilder sb = new StringBuilder();
        sb.append(getMaterial()).append(" basket contains:").append(System.lineSeparator());
        if (!this.data.isEmpty()) {
            for (Egg egg : data) {
                sb.append(egg).append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    public String getMaterial() {
        return this.material;
    }
}
