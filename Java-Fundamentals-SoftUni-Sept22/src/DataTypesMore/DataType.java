package DataTypesMore;

import java.util.Scanner;

public class DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        while (!input.equals("END")){
            if (scanner.hasNextInt())
                System.out.printf("integer");
            else if (scanner.hasNextDouble() || scanner.hasNextFloat())
                System.out.printf("floating point");
            else if (scanner.hasNextBoolean())
                System.out.printf("boolean");
            else if (scanner.hasNextLine())
                if (input.length() == 1)
                    System.out.printf("char");
                else
                    System.out.printf("string");

            input = scanner.nextLine();
        }
    }
}
