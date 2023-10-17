package MethodsMore;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String value = scanner.nextLine();

        switch (type){
            case "int":
                System.out.println(ifInt(value));
                break;
            case "real":
                System.out.printf("%.2f", ifReal(value));
                break;
            case "string":
                System.out.println(ifString(value));
                break;
        }
    }

    public static int ifInt(String value){
        int a = Integer.parseInt(value);
        return a * 2;
    }

    public static double ifReal(String value){
        double a = Double.parseDouble(value);
        return a * 1.5;
    }

    public static String ifString(String value){
        return "$"+value+"$";
    }
}
