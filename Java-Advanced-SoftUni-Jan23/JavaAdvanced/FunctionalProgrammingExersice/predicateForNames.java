package JavaAdvanced.FunctionalProgrammingExersice;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class predicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Function <приема, връща> -> .apply()
//        Consumer <приема> -> void -> .accept()
//        Supplier <връща> -> .get()
//        Predicate <приема> -> true / false -> .test()
//        BiFunction <приема1, приема2, връща> -> .apply()

        int n = Integer.parseInt(scanner.nextLine());
        String[] names = scanner.nextLine().split("\\s+");

        Predicate<String> checkLength = name -> name.length() <= n;
        Arrays.stream(names)
                .filter(checkLength)
                .forEach(System.out::println);

    }
}
