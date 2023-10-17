package DataTypesMore;

import java.math.BigDecimal;
import java.util.Scanner;

public class FloatingEquality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double eps = 0.000001;
            double diff = Math.abs(a - b);
        if (diff <= eps)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
