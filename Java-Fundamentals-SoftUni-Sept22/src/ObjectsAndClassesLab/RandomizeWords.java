package ObjectsAndClassesLab;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        Random rndGenerator = new Random();
        for (int i = 0; i < input.length; i++) {
            int indexX = rndGenerator.nextInt(input.length);
            int indexY = rndGenerator.nextInt(input.length);
            String oldWordX = input[indexX];
            input[indexX] = input[indexY];
            input[indexY] = oldWordX;
        }
        System.out.println(String.join(System.lineSeparator(), input));
    }
}
