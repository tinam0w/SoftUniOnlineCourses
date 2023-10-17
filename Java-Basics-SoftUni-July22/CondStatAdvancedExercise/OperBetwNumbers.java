package CondStatAdvancedExercise;

import java.util.Scanner;

public class OperBetwNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();
        double result = 0;
        String evenOdd = "";
        boolean divZero = false;

        switch (operator){
            case "+":
                result = Math.round(n1+n2);
                break;
            case "-":
                result = n1-n2;
                break;
            case "*":
                result = n1*n2;
                break;
            case "/":
                if (n2 == 0) divZero=true;
                else result = n1*1.0/n2;
                break;
            case "%":
                if (n2 == 0) divZero=true;
                else result = n1%n2;
                break;
        }

        if (result % 2 == 0) evenOdd="even";
        else evenOdd = "odd";

        if (operator.equals("+") || operator.equals("-") || operator.equals("*")) {
            System.out.printf("%d %s %d = %.0f - %s",n1,operator,n2,result,evenOdd);
        } else if (operator.equals("/") && !divZero) {
            System.out.printf("%d %s %d = %.2f", n1, operator, n2, result);
        } else if (operator.equals("%") && !divZero) {
            System.out.printf("%d %s %d = %.0f", n1, operator, n2, result);
        } else if (divZero) {
            System.out.printf("Cannot divide %d by zero", n1);
        }

    }}
