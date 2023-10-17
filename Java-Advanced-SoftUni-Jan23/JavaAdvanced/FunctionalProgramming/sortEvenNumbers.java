package JavaAdvanced.FunctionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class sortEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(", "))
                .map(item -> Integer.parseInt(item)).
                collect(Collectors.toList());

        //numbers.removeIf(num -> isOdd(num));
        numbers.removeIf(num -> num % 2 != 0);//премахва нечетните

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i));

            if (i < numbers.size() - 1)
                System.out.print(", ");
        }

        //     .filter(num -> num % 2 != 0)   //връща стрий с нечетните
        System.out.println();

        //numbers.sort(); - сортира и променя текущата колекция
        //numbers.stream().sorted() - сортира и връща нова колекция

        List<Integer> sortedNumbers = numbers.stream().sorted()
                //.collect(Collectors.joining())
                //.forEach(sum -> System.out.print(sum + " "));
                .collect(Collectors.toList());
        //сортира в натурален ред
        // = numbers.stream().sorted((l,r) -> Integer.compare(l,r));
        // = numbers.stream().sorted((l,r) -> l.compareTo(r));
        // = numbers.stream().sorted(Integer::compare);

        for (int i = 0; i < sortedNumbers.size(); i++) {
            System.out.print(sortedNumbers.get(i));

            if (i < sortedNumbers.size() - 1)
                System.out.print(", ");
        }

    }
    private static boolean isOdd(int num){
        return num % 2 != 0;
    }
}
