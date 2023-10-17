package DataTypesLab;

import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char symbol = scanner.next().charAt(0);
        if (Character.isUpperCase(symbol))
            System.out.println("upper-case");
        else
            System.out.println("lower-case");

        //if (symbol >= 'a' && symbol <= 'z')
        //if (symbol >= 65 && symbol <= 82)
    }
}
