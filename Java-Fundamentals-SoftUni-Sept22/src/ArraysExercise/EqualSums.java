package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int equalIndexes = 0;
        for (int i = 0; i <= inputArr.length - 1 ; i++) {
            int sumLeft = 0;
            int sumRight = 0;
            if (i != 0) {
                for (int j = 0; j < i; j++) {
                    sumLeft += inputArr[j];
                }
            }
            if (i != inputArr.length - 1) {
                for (int j = i + 1; j < inputArr.length; j++) {
                    sumRight += inputArr[j];
                }
            }
            if (sumLeft == sumRight) {
                System.out.print(i);
                equalIndexes++;
            }
        }
        if (equalIndexes == 0)
            System.out.println("no");
    }
}
