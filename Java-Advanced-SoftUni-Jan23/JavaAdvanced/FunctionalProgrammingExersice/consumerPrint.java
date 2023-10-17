package JavaAdvanced.FunctionalProgrammingExersice;

import java.util.Scanner;
import java.util.function.Consumer;

public class consumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //        Function <приема, връща> -> .apply()
//        Consumer <приема> -> void -> .accept()
//        Supplier <връща> -> .get()
//        Predicate <приема> -> true / false -> .test()
//        BiFunction <приема1, приема2, връща> -> .apply()

        String[] input = scanner.nextLine().split("\\s+");

        //първи начин:
        Consumer<String> printName = name -> System.out.println(name);
        for (String name : input) {
            printName.accept(name);
        }

        //втори начин:
        Consumer<String[]> printArray = array -> {
            for (String name : input) {
                printName.accept(name);
            }
        };
        printArray.accept(input);

    }
}

