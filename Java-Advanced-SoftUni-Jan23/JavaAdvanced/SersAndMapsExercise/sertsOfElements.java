package JavaAdvanced.SersAndMapsExercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class sertsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int a = Integer.parseInt(input.split(" ")[0]);
        int b = Integer.parseInt(input.split(" ")[1]);
        Set<Integer> set1 = new LinkedHashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();

        for (int i = 0; i < a; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            set1.add(number);
        }
        for (int i = 0; i < b; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            set2.add(number);
        }
        for (int num1 : set1) {
            for (int num2 : set2) {
                if (num1 == num2)
                    System.out.print(num1 + " ");
            }
        }
    }
}
