package Exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Comparable<T>> {

    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element){
        this.elements.add(element);
    }

    public T remove(int index){
        return this.elements.remove(index);
    }

    public boolean contains(T element){
        return this.elements.contains(element);
    }

    public void swap(int ind1, int ind2){
        T el1 = this.elements.get(ind1);
        T el2 = this.elements.get(ind2);
        this.elements.set(ind1, el2);
        this.elements.set(ind2, el1);
    }

    public int countGraterThan(T element){
        int count = 0;
        for (T el : this.elements) {
            if (el.compareTo(element) > 0)
                count++;
        }
        return count;
    }

    public T getMax(){
        return this.elements.stream().max(Comparator.naturalOrder()).get();
    }

    public T getMin(){
        return this.elements.stream().min((e1, e2) -> e1.compareTo(e2)).get();
    }

    public void print(){
        for (T el : elements) {
            System.out.println(el);
        }
    }

    public void sort(){
        Sorter.sort(this.elements);
    }


}
