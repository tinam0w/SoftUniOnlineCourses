package DataTypesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());
        int result = 0;

        if (n % p == 0)
            result = n / p;
        else
            result = (n / p) + 1;
        System.out.println(result);
    }
}
