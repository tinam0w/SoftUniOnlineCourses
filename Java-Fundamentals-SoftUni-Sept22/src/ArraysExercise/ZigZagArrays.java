package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];
        for (int i = 0; i < n ; i++) {
            int[] firstInputArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (i % 2 == 0) {
                firstArr[i] = firstInputArr[0];
                secondArr[i] = firstInputArr[1];
            } else {
                firstArr[i] = firstInputArr[1];
                secondArr[i] = firstInputArr[0];
            }
        }

        for (int item:firstArr) {
            System.out.print(item + " ");
        }
        System.out.println();
        for (int item:secondArr) {
            System.out.print(item + " ");
        }
    }
}
