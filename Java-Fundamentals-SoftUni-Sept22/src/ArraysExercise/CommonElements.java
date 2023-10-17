package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input1Arr = scanner.nextLine().split(" ");
        String[] input2Arr = scanner.nextLine().split(" ");

            String[] resultArr = new String[input1Arr.length];

        for (int j = 0; j <= input1Arr.length - 1; j++) {
            for (int i = 0; i <= input2Arr.length - 1; i++) {
                if (input1Arr[j].equals(input2Arr[i]))
                    resultArr[i] = input1Arr[j];
            }
        }
        for (String item:resultArr) {
            if (!(item == null))
                System.out.print(item + " ");
        }
    }
}
