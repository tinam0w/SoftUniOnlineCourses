package JavaAdvanced.Workshop;

import java.util.function.Consumer;

public class SmartArray {

    private static final int INITIAL_CAPACITY = 10;

    private int[] data;

//    public void insert(int index, int element){
//        checkIndex(index);
//        if (index == this.size - 1){
//            add(this.data[this.size - 1]);
//            this.data[this.size - 2] = element;
//        } else {
//            if (this.size == this.capacity){
//                resize();
//            }
//            shiftRight();
//            this.size++;
//            this.data[index] = element;
//        }
//    }
    
//    private void shiftRight(int index){
//        for (int i = this.size; i > index ; i--) {
//            this.data[i] = this.data[i - 1];
//        }
//    }

//    public void forEach(Consumer<Integer> consumer){
//        for (int i = 0; i < this.size; i++) {
//            consumer.accept(this.data[i]);
//        }
//    }

}
