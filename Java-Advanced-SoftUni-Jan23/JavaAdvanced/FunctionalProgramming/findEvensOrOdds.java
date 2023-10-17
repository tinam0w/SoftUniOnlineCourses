package JavaAdvanced.FunctionalProgramming;

import org.w3c.dom.ranges.Range;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class findEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int lower = Integer.parseInt(input[0]);
        int upper = Integer.parseInt(input[1]);

        String oddOrEven = scanner.nextLine();

        //oddOrEven.equals("odd") ? (true) : (false);
        Predicate<Integer> filterCondition =
                oddOrEven.equals("odd") ? (x -> x % 2 != 0) : (x -> x % 2 == 0);

        //equals:
//        Predicate<Integer> other:
//        if(oddOrEven.equals("odd")){
//            other = x -> x % 2 != 0;
//        } else if (oddOrEven.equals("even")) {
//            other = x -> x % 2 == 0;
//        }

        IntStream.rangeClosed(lower, upper)
                .filter(num -> filterCondition.test(num))
                .forEach(num -> System.out.print(num + " "));

    }
}
