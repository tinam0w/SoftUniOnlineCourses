package JavaAdvanced.FunctionalProgrammingExersice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class customMinFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Function <приема, връща> -> .apply()
//        Consumer <приема> -> void -> .accept()
//        Supplier <връща> -> .get()
//        Predicate <приема> -> true / false -> .test()
//        BiFunction <приема1, приема2, връща> -> .apply()

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        //първи наин:
        //System.out.println(Collections.min(numbers));

        //втори начин:
        //Consumer<List<Integer>> printMinNumber = list -> System.out.println(Collections.min(list));
        //printMinNumber.accept(numbers);

        //трети начин:
        Function<List<Integer>, Integer> getMinNumber = x -> Collections.min(x);
        System.out.println(getMinNumber.apply(numbers));

    }
}
