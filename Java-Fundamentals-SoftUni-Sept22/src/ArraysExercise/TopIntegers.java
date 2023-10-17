package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < inputArr.length - 1; i++) {
            int count = 0;
            for (int j = i + 1; j <= inputArr.length - 1; j++) {
                if (inputArr[i] > inputArr[j])
                    count++;
            }
            if (count == inputArr.length - 1 - i)
                System.out.print(inputArr[i] + " ");
        }
        System.out.print(inputArr[inputArr.length - 1]);
    }
}
