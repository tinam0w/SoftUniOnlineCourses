package NestedLoopsMore;

import java.util.Scanner;

public class SumOfTwoNubers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int count = 0;
        int counter = 0;
        int a = 0;
        int b = 0;
        boolean isOver = false;

        for (int i = begin; i <= end ; i++) {
            for (int j = begin; j <= end ; j++) {
                count++;
                if ( i + j == magicNum){
                    a = i;
                    b = j;
                    counter++;
                }
                if (counter == 1) {
                    isOver = true;
                    break;
                }
            }
            if (isOver)
                break;
        }
        if (counter == 0)
            System.out.printf("%d combinations - neither equals %d", count, magicNum);
        else
            System.out.printf("Combination N:%d (%d + %d = %d)",count, a, b, magicNum);
    }
}
