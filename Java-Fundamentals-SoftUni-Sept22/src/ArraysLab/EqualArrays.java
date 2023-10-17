package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input1Arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] input2Arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        int sum = 0;
        int index = 0;
        for (int i = 0; i < input1Arr.length; i++) {
            if (input1Arr[i] == input2Arr[i]) {
                count++;
                sum += input1Arr[i];
            } else {
                index = i;
                break;
            }
        }
        if (count == input1Arr.length)
            System.out.printf("Arrays are identical. Sum: %d", sum);
        else
            System.out.printf("Arrays are not identical. Found difference at %d index.", index);
    }
}
