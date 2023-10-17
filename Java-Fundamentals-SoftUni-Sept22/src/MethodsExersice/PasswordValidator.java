package MethodsExersice;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();
        isValidPass(password);
    }

    public static void isValidPass(String password) {
        int isValid = 0;
        if (!(password.length() >= 6 && password.length() <= 10)) {
            System.out.println("Password must be between 6 and 10 characters");
        } else
            isValid++;

        int countNums = 0;
        boolean isNot = false;
        for (int i = 0; i < password.length(); i++) {
            if (password.charAt(i) >= 48 && password.charAt(i) <= 57) {
                countNums++;
            } else if (!((password.charAt(i) >= 65 && password.charAt(i) <= 90) ||
                    (password.charAt(i) >= 97 && password.charAt(i) <= 122))) {
                isNot = true;
            }
        }
        if (isNot)
            System.out.println("Password must consist only of letters and digits");
        else
            isValid++;

        if (countNums < 2) {
            System.out.println("Password must have at least 2 digits");
        } else
            isValid++;

        if (isValid == 3)
            System.out.println("Password is valid");
    }
}

