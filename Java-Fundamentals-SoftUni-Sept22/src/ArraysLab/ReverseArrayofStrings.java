package ArraysLab;

import java.util.Scanner;

public class ReverseArrayofStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");

        for (int i = 0; i < inputArr.length / 2; i++) {
            String oldElement = inputArr[i];
            inputArr[i] = inputArr[inputArr.length - i - 1];
            inputArr[inputArr.length - i - 1] = oldElement;
        }

        System.out.println(String.join(" ",inputArr));
    }
}
