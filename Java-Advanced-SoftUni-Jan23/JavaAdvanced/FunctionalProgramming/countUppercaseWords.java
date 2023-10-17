package JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class countUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> startsWithUpperCase = word -> Character.isUpperCase(word.charAt(0));
        Consumer<String> print = word -> System.out.println(word);

        List<String> upperCseWords = Arrays.stream(scanner.nextLine().split(" "))
                .filter(w -> startsWithUpperCase.test(w))
                .collect(Collectors.toList());

        System.out.println(upperCseWords.size());

        upperCseWords.forEach(e -> print.accept(e));

    }
}
