package JavaAdvanced.FunctionalProgrammingExersice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

public class knightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Function <приема, връща> -> .apply()
//        Consumer <приема> -> void -> .accept()
//        Supplier <връща> -> .get()
//        Predicate <приема> -> true / false -> .test()
//        BiFunction <приема1, приема2, връща> -> .apply()

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String> print = name -> System.out.println("Sir " + name);

        Arrays.stream(names).forEach(print);

    }
}
