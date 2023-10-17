package IteratorsExersice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ListyIterator<T> implements Iterable<T> {

    private List<T> elements;
    private int currentIndex;

    public ListyIterator(T... elements) {
        this.elements = Arrays.asList(elements);
        this.currentIndex = 0;
    }

    public boolean move(){
        if (hasNext()) {
            this.currentIndex++;
            return true;
        }
        return false;
    }

    public boolean hasNext(){
        return this.currentIndex < this.elements.size() - 1;
    }

    public void print(){
        if (this.elements.isEmpty()){
            throw new IllegalStateException("Invalid Operation!");
        } else {
            System.out.println(this.elements.get(this.currentIndex));
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }

    private class TIterator implements Iterator<T> {
        private int counter;

        @Override
        public boolean hasNext() {
            return counter < elements.size();
        }

        @Override
        public T next() {
            return elements.get(this.counter++);
        }
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        //Iterable.super.forEach(action::accept);
        while (this.elements.iterator().hasNext()){
            action.accept(this.elements.iterator().next());
        }
    }
}
