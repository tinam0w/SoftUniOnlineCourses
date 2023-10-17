package DataTypesMore;

import java.util.Scanner;

public class FromLeftToTheRight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());;
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            int space = 0;
            for (int j = 0; j <= input.length() - 1 ; j++) {
                char isSpace = input.charAt(j);
                if (isSpace == ' ') {
                    space = j;
                    break;
                }
            }
            double left = Double.parseDouble(input.substring(0,space));
            double right = Double.parseDouble(input.substring(space +1));
            int sumL = 0;
            int sumR = 0;
            double currentL = left;
            double currentR = right;

            while(currentL != 0){
                double digit = currentL % 10;
                sumL += digit;
                currentL = currentL / 10;
            }
            while(currentR != 0){
                double digit = currentR % 10;
                sumR += digit;
                currentR = currentR / 10;
            }

            if (left >= right)
                System.out.println(Math.abs(sumL));
            else
                System.out.println(Math.abs(sumR));
        }
    }
}
