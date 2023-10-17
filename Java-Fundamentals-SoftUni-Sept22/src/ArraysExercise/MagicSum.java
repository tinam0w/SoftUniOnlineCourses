package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numbersArr.length - 1 ; i++) {
            for (int j = i + 1; j <= numbersArr.length - 1; j++) {
                if(numbersArr[i] + numbersArr[j] == magicSum)
                    System.out.println(numbersArr[i] + " " + numbersArr[j]);
            }
        }
    }
}

