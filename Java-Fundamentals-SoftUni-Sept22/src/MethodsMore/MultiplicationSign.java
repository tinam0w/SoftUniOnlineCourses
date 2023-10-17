package MethodsMore;

import java.util.Scanner;

public class MultiplicationSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int[] num = {a, b, c};

        isPositive(num);
    }

    public static void isPositive(int[] num){
        int countLess = 0;
        int countZero = 0;
        int countMore = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0)
                countLess++;
            else if (num[i] == 0)
                countZero++;
            else
                countMore++;
        }

        if (countLess == 1 || countLess == 3)
            System.out.println("negative");
        else if (countZero >= 1)
            System.out.println("zero");
        else
            System.out.println("positive");
    }
}
