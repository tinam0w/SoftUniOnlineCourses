package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int sumOdd = 0;
        int sumEven = 0;

        for (int item : inputArr) {
            if (item % 2 == 0)
                sumEven += item;
            else
                sumOdd += item;
        }
        System.out.printf("%d", sumEven - sumOdd);
    }
}
