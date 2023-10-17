package JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class sumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String, Integer> parseInt = s -> Integer.parseInt(s);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(e -> parseInt.apply(e))
                .collect(Collectors.toList());

        int sum = numbers.stream().mapToInt(a -> a).sum(); //identity function a -> a

        System.out.println("Count = " + numbers.size());
        System.out.println("Sum = " + sum);
    }
}
