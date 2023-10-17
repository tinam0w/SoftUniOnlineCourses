package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        int i = 0;
        while (!(firstList.size() == 0 || secondList.size() == 0)) {
            if (firstList.get(i).equals(secondList.get(i))) {
                firstList.remove(i);
                secondList.remove(i);
            } else if (firstList.get(i) > secondList.get(i)) {
                int card = firstList.get(i);
                firstList.remove(i);
                firstList.add(secondList.get(i));
                secondList.remove(i);
                firstList.add(card);
            } else if (secondList.get(i) > firstList.get(i)) {
                int card = secondList.get(i);
                secondList.remove(i);
                secondList.add(firstList.get(i));
                firstList.remove(i);
                secondList.add(card);
            }
        }
        int sum = 0;
        if (firstList.size() == 0) {
            for (int item : secondList) {
                sum += item;
            }
            System.out.println("Second player wins! Sum: " + sum);
        } else if (secondList.size() == 0) {
            for (int item : firstList) {
                sum += item;
            }
            System.out.println("First player wins! Sum: " + sum);
        }
    }
}
