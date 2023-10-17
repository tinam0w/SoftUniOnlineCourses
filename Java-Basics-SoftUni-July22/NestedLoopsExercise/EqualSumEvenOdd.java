package NestedLoopsExercise;

import java.util.Scanner;

public class EqualSumEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());



        for (int i = first; i <= second ; i++) {
            int current = i;
            int sumOdd = 0;
            int sumEven = 0;
            for (int j = 6; j >= 1 ; j--) {
                int digit = current % 10;
                if (j % 2 == 0){
                    sumEven += digit;
                }else {
                    sumOdd += digit;
                }
                current = current / 10;
            }
            if ( sumEven == sumOdd)
                System.out.print(i + " ");
        }
    }
}
