package JavaAdvanced.FunctionalProgramming;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class findEvenOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int lower = Integer.parseInt(input[0]);
        int upper = Integer.parseInt(input[1]);

        String oddOrEven = scanner.nextLine();

        Predicate<Integer> filterCondition =
                oddOrEven.equals("odd") ?
                        (x -> x % 2 != 0) :
                        (x -> x % 2 == 0);

        //същото като:
//        Predicate<Integer> filterCondition2;
//        if (oddOrEven.equals("odd")){
//            filterCondition2 = x -> x % 2 != 0;
//        } else {
//            filterCondition2 = x -> x % 2 == 0;
//        }
//
        //същото като:
//        Predicate<Integer> filterCondition3 = x -> x % 2 == 0;
//        if (oddOrEven.equals("odd")){
//            filterCondition2 = x -> x % 2 != 0;
//        }

        IntStream.rangeClosed(lower, upper)
                .filter(num -> filterCondition.test(num))
                .forEach(num -> System.out.print(num + " "));

    }
}
