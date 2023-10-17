package IteratorsExersice.StackIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack implements Iterable<Integer> {
    private List<Integer> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public void add(int number){
        stack.add(number);
    }

    public int pop(){
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty(){
        return stack.size() <= 0;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new StackIterator();
    }

    public class StackIterator implements Iterator<Integer>{
        private int index;

        public StackIterator() {
            this.index = stack.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return index >= 0;
        }

        @Override
        public Integer next() {
            return stack.get(index--);
        }
    }
}
