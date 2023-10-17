package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] % 2 == 0) {
                sum += inputArr[i];
            }
        }
        System.out.println(sum);
    }
}