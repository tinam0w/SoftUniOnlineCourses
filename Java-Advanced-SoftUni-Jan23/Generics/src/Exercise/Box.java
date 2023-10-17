package Exercise;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {

    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T element : list) {
            sb.append(element.getClass().getName() + ": " + element).append(System.lineSeparator());
        }
        return sb.toString();
    }

    public void swap(int index1, int index2) {
        T element1 = this.list.get(index1);
        T element2 = this.list.get(index2);
        this.list.set(index1, element2);
        this.list.set(index2, element1);
    }

    public int countGraterThan(T element){
        int counter = 0;
        for (T el : this.list) {
            if (el.compareTo(element) > 0){
                counter++;
            }
        }
        return counter;
    }
}
