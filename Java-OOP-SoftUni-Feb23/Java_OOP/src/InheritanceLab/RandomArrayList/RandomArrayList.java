package InheritanceLab.RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList<T> extends ArrayList {

    private final Random random;
    public RandomArrayList(){
        super();
        this.random = new Random();
    }

    public Object getRandomElement() {
        int rand = random.nextInt();
        //range of valid indexes:
        int index = Math.abs(rand % super.size());

        Object result = super.get(index);
        super.remove(index);

        return result;
    }
}
