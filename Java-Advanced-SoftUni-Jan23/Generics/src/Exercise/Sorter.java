package Exercise;

import java.util.Collections;
import java.util.List;

public class Sorter<T extends Comparable<T>> {

    public static <T extends Comparable<T>> List<T> sort(List<T> list){
        Collections.sort(list);
        return list;
    }
}
