package MidExamExercise;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            switch (command[0]) {
                case "swap":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                    int element = numbers[index2];
                    numbers[index2] = numbers[index1];
                    numbers[index1] = element;
                    break;
                case "multiply":
                    int indexS = Integer.parseInt(command[1]);
                    int indexE = Integer.parseInt(command[2]);
                    int result = numbers[indexS] * numbers[indexE];
                    numbers[indexS] = result;
                    break;
                case "decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] = numbers[i] - 1;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1)
                System.out.print(numbers[i]);
            else
                System.out.print(numbers[i] + ", ");
        }
    }
}
