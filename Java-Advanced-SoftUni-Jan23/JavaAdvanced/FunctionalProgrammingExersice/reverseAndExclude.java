package JavaAdvanced.FunctionalProgrammingExersice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class reverseAndExclude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Function <приема, връща> -> .apply()
//        Consumer <приема> -> void -> .accept()
//        Supplier <връща> -> .get()
//        Predicate <приема> -> true / false -> .test()
//        BiFunction <приема1, приема2, връща> -> .apply()

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int n = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);
        Predicate<Integer> isDivisible = x -> x % n == 0;

        numbers.removeIf(isDivisible);
        numbers.forEach(num -> System.out.print(num + " "));

        System.out.println();

        //numbers.stream().filter(e -> isDivisible.negate().test(e))
        //        .forEach(e -> System.out.print(e + " "));

        //без предикат:
        //numbers.stream().filter( x -> x % n != 0)
        //        .forEach(e -> System.out.print(e + " "));
    }
}
