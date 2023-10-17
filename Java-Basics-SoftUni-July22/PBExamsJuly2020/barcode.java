package PBExamsJuly2020;

import java.util.Scanner;

public class barcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        int firstNumFirstDigit = firstNum / 1000;
        int firstNumSecondDigit = (firstNum / 100) % 10;
        int firstNumThirdDigit = (firstNum / 10) % 10;
        int firstNumForthDigit = firstNum % 10;

        int secondNumFirstDigit = secondNum / 1000;
        int secondNumSecondDigit = (secondNum / 100) % 10;
        int secondNumThirdDigit = (secondNum / 10) % 10;
        int secondNumForthDigit = secondNum % 10;


        for (int i = firstNumFirstDigit; i <= secondNumFirstDigit; i++) {
            for (int j = firstNumSecondDigit; j <= secondNumSecondDigit; j++) {
                for (int k = firstNumThirdDigit; k <= secondNumThirdDigit; k++) {
                    for (int l = firstNumForthDigit; l <= secondNumForthDigit; l++) {

                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.printf("%d%d%d%d ", i, j, k, l);
                        }


                    }
                }
            }
        }
    }
}
