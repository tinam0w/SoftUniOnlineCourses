package MethodsExersice;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")){
            int number = Integer.parseInt(input);
            if (isPalindrome(number))
                System.out.println("true");
            else
                System.out.println("false");

            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(int num){
        String fromLeft = "" + num;
        String fromRight = "";
        for (int i = fromLeft.length() - 1; i >= 0 ; i--) {
            fromRight = fromRight + fromLeft.charAt(i);
        }
        if (fromLeft.equals(fromRight))
            return true;
        else
            return false;
    }
}
