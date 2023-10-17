package ListExercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        String result = "";
        for (int i = input.length - 1; i >= 0; i--) {
            String toAdd = input[i].replace(" ", "");
            result += toAdd;
        }
        for (char symbol : result.toCharArray()) {
            System.out.print(symbol + " ");
        }
    }
}
