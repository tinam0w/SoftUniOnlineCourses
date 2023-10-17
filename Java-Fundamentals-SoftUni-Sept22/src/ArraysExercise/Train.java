package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int[] result = new int[n];
        int sum = 0;
        for (int i = 0; i < n ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            result[i] = people;
            sum += people;
        }
        for (int item : result){
            System.out.print(item + " ");
        }
        System.out.printf("%n%d", sum);
    }
}
