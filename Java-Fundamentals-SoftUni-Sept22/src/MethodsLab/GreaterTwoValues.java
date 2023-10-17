package MethodsLab;

import java.util.Scanner;

public class GreaterTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String firstIn = scanner.nextLine();
        String secondIn = scanner.nextLine();

        switch (type){
            case "int":
                int a = Integer.parseInt(firstIn);
                int b = Integer.parseInt(secondIn);
                System.out.println(getMax(a, b));
                break;
            case "char":
                System.out.println(getMax(firstIn, secondIn));
                break;
            case "string":
                System.out.println(getMax(firstIn, secondIn));
                break;
        }
    }

    public static int getMax(int first, int second){
        if (first > second)
            return first;
        else
            return second;
    }

    public static char getMax(char first, char second){
        if (first > second)
            return first;
        else
            return second;
    }

    public static String getMax(String first, String second){
        if (first.compareTo(second) > 0)
            return first;
        else
            return second;
    }
}
