package ListMore;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CarRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> times = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> firstCar = times.subList(0, times.size() / 2);
        List<Integer> secondCar = times.subList(times.size() / 2 + 1, times.size());
        Collections.reverse(secondCar);

        double sumFirst = 0;
        double sumSecond = 0;
        for (int i = 0; i < firstCar.size(); i++) {
            sumFirst += firstCar.get(i);
            if (firstCar.get(i) == 0 && sumFirst > 0)
                sumFirst = sumFirst * 0.8;
        }
        for (int i = 0; i < secondCar.size(); i++) {
            sumSecond += secondCar.get(i);
            if (secondCar.get(i) == 0 && sumSecond > 0)
                sumSecond = sumSecond * 0.8;
        }

        if (sumFirst < sumSecond) {
            System.out.printf("The winner is left with total time: %.1f", sumFirst);
        } else if (sumSecond < sumFirst) {
            System.out.printf("The winner is right with total time: %.1f", sumSecond);
        }
        System.out.println();
    }
}
