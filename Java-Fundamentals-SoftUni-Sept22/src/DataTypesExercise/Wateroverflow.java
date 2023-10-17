package DataTypesExercise;

import java.util.Scanner;

public class Wateroverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
            if (sum > 255) {
                System.out.println("Insufficient capacity!");
                sum = sum - input;
            }
        }
        System.out.printf("%d", sum);
    }
}