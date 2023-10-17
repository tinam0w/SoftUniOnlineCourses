package JavaAdvanced.FunctionalProgrammingExersice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class appliedArithmetics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Function <приема, връща> -> .apply()
//        Consumer <приема> -> void -> .accept()
//        Supplier <връща> -> .get()
//        Predicate <приема> -> true / false -> .test()
//        BiFunction <приема1, приема2, връща> -> .apply()

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, List<Integer>> addCommand =
                list -> list.stream()
                        .map(e -> e += 1)
                        .collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiplyCommand =
                list -> list.stream()
                        .map(e -> e *= 2)
                        .collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtractCommand =
                list -> list.stream()
                        .map(e -> e -= 1)
                        .collect(Collectors.toList());
        Consumer<List<Integer>> printCommand = list -> list.forEach(e -> System.out.print(e + " "));

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "add":
                    numbers = addCommand.apply(numbers);
                    break;
                case "multiply":
                    numbers = multiplyCommand.apply(numbers);
                    break;
                case "subtract":
                    numbers = subtractCommand.apply(numbers);
                    break;
                case "print":
                    printCommand.accept(numbers);
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
    }
}
