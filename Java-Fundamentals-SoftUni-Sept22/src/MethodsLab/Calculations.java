package MethodsLab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());

        switch (input){
            case "add":
                addNumbers(firstNum, secondNum);
                break;
            case "multiply":
                multiplyNumbers(firstNum, secondNum);
                break;
            case "subtract":
                subtractNumbers(firstNum, secondNum);
                break;
            case "divide":
                divideNumbers(firstNum, secondNum);
                break;
        }
    }

    public static void multiplyNumbers(int firstNum, int secondNum){
        int result = firstNum * secondNum;
        System.out.println(result);
    }

    public static void subtractNumbers(int firstNum, int secondNum){
        int result = firstNum - secondNum;
        System.out.println(result);
    }

    public static void divideNumbers(int firstNum, int secondNum){
        int result = firstNum / secondNum;
        System.out.println(result);
    }

    public static void addNumbers(int firstNum, int secondNum){
        int result = firstNum + secondNum;
        System.out.println(result);
    }
}
