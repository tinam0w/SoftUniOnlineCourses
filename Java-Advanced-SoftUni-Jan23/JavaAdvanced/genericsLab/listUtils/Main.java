package JavaAdvanced.genericsLab.listUtils;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4);

        System.out.println(ListUtils.getMax(numbers));
        System.out.println(ListUtils.getMin(numbers));

    }
}
