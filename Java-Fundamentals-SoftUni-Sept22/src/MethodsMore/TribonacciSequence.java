package MethodsMore;

import java.util.Scanner;

public class TribonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[n];

        if (n == 1)
            firstArr[0] = 1;
        else if (n == 2) {
            firstArr[0] = 1;
            firstArr[1] = 1;
        } else if (n == 3) {
            firstArr[0] = 1;
            firstArr[1] = 1;
            firstArr[2] = 2;
        } else {
            firstArr[0] = 1;
            firstArr[1] = 1;
            firstArr[2] = 2;
            for (int i = 3; i <= firstArr.length - 1; i++) {
                firstArr[i] = firstArr[i - 1] + firstArr[i - 2] + firstArr[i - 3];
            }
        }
        printArray(firstArr);
    }

    public static void printArray(int[] array){
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

}
