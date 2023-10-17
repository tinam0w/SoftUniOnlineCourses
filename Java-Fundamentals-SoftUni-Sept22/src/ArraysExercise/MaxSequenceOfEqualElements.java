package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int maxRepeats = 0;
        int number = 0;
        for (int i = 0; i < inputArr.length - 1 ; i++) {
            int count = 1;
            for (int j = i; j < inputArr.length - 1; j++) {
                if (inputArr[i] == inputArr[j + 1])
                    count++;
                else
                    break;
            }
            if (count > maxRepeats) {
                maxRepeats = count;
                number = inputArr[i];
            }
        }
        for (int i = 1; i <= maxRepeats ; i++) {
            System.out.print(number + " ");
        }
    }
}
