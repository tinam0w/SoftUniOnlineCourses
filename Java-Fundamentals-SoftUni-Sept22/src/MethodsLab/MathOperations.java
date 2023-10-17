package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        String operator = scanner.nextLine();
        double b = Double.parseDouble(scanner.nextLine());
        DecimalFormat df = new DecimalFormat("0.##");

        switch (operator){
            case "/":
                System.out.println(df.format(subtractNumbers(a, b)));
                break;
            case "*":
                System.out.println(df.format(multiplyNumbers(a, b)));
                break;
            case "+":
                System.out.println(df.format(sumNumbers(a, b)));
                break;
            case "-":
                System.out.println(df.format(divideNumbers(a, b)));
                break;
        }
    }

    public static double sumNumbers(double a, double b){
        return a + b;
    }

    public static double divideNumbers(double a, double b){
        return a - b;
    }

    public static double multiplyNumbers(double a, double b){
        return a * b;
    }

    public static double subtractNumbers(double a, double b){
        return a / b;
    }
}
