package MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double number = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());


        System.out.println(new DecimalFormat("0.#####").format(numberToPower(number, power)));
    }

    public static double numberToPower(double num, int pow){
        double result = 1;
        for (int i = 1; i <= pow ; i++) {
            result = result * num;
        }
        return result;
    }
}
