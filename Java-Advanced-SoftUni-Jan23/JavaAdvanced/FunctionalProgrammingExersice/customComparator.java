package JavaAdvanced.FunctionalProgrammingExersice;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class customComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //        Function <приема, връща> -> .apply()
//        Consumer <приема> -> void -> .accept()
//        Supplier <връща> -> .get()
//        Predicate <приема> -> true / false -> .test()
//        BiFunction <приема1, приема2, връща> -> .apply()

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Comparator<Integer> sortNumbers = (l, r) -> {
            if (l % 2 == 0 && r % 2 != 0){
                return -1; //не мести
            } else if (l % 2 != 0 && r % 2 == 0) {
                return 1;  //размества
            } else {
                return l.compareTo(r); //сортира натурално
            }
        };

        numbers.stream().sorted(sortNumbers)
                .forEach(e -> System.out.print(e + " "));
    }
}
