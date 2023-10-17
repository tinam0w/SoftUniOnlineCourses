package DataTypesMore;

import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        while (!input.equals("END")){
            boolean isInt = false;
            boolean isDouble = false;
            boolean isString = false;
            boolean isChar = false;
            boolean isBoolean = false;

            if (input.equals("true") || input.equals("false"))
                isBoolean = true;
            else if (input.charAt(0) >= 48 && input.charAt(0) <= 57){
                for (int i = 1; i <= input.length() - 1; i++) {
                    if (input.charAt(i) == 44 || input.charAt(i) == 46)
                        isDouble = true;
                }
                if (!isDouble)
                    isInt = true;
            } else if (input.charAt(0) == 45) {
                if (input.charAt(1) >= 48 && input.charAt(1) <= 57)
                    for (int i = 1; i <= input.length() - 1; i++) {
                        if (input.charAt(i) == 44 || input.charAt(i) == 46)
                            isDouble = true;
                    }
                if (!isDouble)
                    isInt = true;
            } else {
                if (input.length() == 1)
                    isChar = true;
                else
                    isString = true;
            } 

            if (isBoolean)
                System.out.printf("%s is boolean type%n", input);
            else if (isChar)
                System.out.printf("%s is character type%n", input);
            else if (isString)
                System.out.printf("%s is string type%n", input);
            else if (isDouble)
                System.out.printf("%s is floating point type%n", input);
            else if (isInt)
                System.out.printf("%s is integer type%n", input);

            input = scanner.nextLine();
        }
    }
}
