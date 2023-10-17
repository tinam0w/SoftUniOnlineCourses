package Christmas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bag {
    private String color;
    private int capacity;
    private List<Present> data;

    public Bag(String color, int capacity) {
        this.color = color;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public int count() {
        return this.data.size();
    }

    public void add(Present present) {
        if (this.count() >= getCapacity()) {
            return;
        }
        this.data.add(present);
    }

    public boolean remove(String name) {
        return this.data.removeIf(p -> p.getName().equals(name));
    }

    public Present heaviestPresent() {
        return this.data.stream()
                .sorted((l, r) -> Double.compare(r.getWeight(), l.getWeight()))
                .collect(Collectors.toList())
                .get(0);
    }

    public Present getPresent(String name) {
        for (Present present: data) {
            if (present.getName().equals(name)){
                return present;
            }
        }
        return null;

//        this.data.stream().filter(p -> p.getName().equals(name))
//                .collect(Collectors.toList())
//                .get(0);
    }

    public String report(){
        Object presentsString = this.data.stream().map( p -> p.toString())
                .collect(Collectors.joining("\n"));
        return  String.format("%s bag contains:\n%s", this.color, presentsString);
    }

    public String getColor() {
        return color;
    }

    public int getCapacity() {
        return capacity;
    }
}
