package JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class sumNumbers2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        BiFunction<Integer, String, Integer> parseAndAdd =
                (acc, e) -> acc + Integer.parseInt(e);

        List<String> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        for (String number: numbers) {
            sum = parseAndAdd.apply(sum, number);
        }

        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + sum);


        //с reduce:

        Integer reducedSum = numbers.stream()
                .map(str -> Integer.parseInt(str))
                .reduce(0, (acc, curr) -> acc + curr);

        System.out.println("Reduced sum = " + reducedSum);

    }
}
