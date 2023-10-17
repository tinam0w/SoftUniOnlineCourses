package JavaAdvanced.FunctionalProgrammingExersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class listOfPredicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Function <приема, връща> -> .apply()
//        Consumer <приема> -> void -> .accept()
//        Supplier <връща> -> .get()
//        Predicate <приема> -> true / false -> .test()
//        BiFunction <приема1, приема2, връща> -> .apply()


        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        BiFunction<Integer, List<Integer>, Boolean> isDivisible =
                (num, list) -> {
                    for (int number : list) {
                        if (num % number != 0)
                            return false;
                    }
                    return true;
                };

        for (int i = 1; i <= n ; i++) {
            if (isDivisible.apply(i, numbers)){
                System.out.print(i + " ");
            }
        }

    }
}
