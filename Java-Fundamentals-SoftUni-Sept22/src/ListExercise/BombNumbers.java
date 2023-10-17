package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] input = scanner.nextLine().split("\\s+");
        int number = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);

        while (numList.contains(number)) {
            int index = numList.indexOf(number);
            int leftIndex = Math.max(0, index - power);
            int rightIndex = Math.min(index + power, numList.size() - 1);

            for (int i = rightIndex; i >= leftIndex ; i--) {
                numList.remove(i);
            }
        }

        int sum = 0;
        for (int item : numList) {
            sum += item;
        }
        System.out.println(sum);
    }
}
