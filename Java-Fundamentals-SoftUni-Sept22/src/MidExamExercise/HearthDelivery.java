package MidExamExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class HearthDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> neighborhood = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        int index = 0;
        int[] result = new int[neighborhood.size()];
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Love!")) {
            String[] input = inputLine.split("\\s+");
            int jump = Integer.parseInt(input[1]);
            if (index + jump > neighborhood.size() - 1) {
                index = 0;
            } else {
                index = jump + index;
            }
            if (neighborhood.get(index) == 0) {
                System.out.printf("Place %d already had Valentine's day.%n", index);
            } else {
                int current = neighborhood.get(index) - 2;
                neighborhood.set(index, current);
                if (neighborhood.get(index) <= 0) {
                    result[index] = 1;
                    System.out.printf("Place %d has Valentine's day.%n", index);
                }
            }
            inputLine = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", index);
        if (isAllValentines(result))
            System.out.println("Mission was successful.%n");
        else
            System.out.printf("Cupid has failed %d places.%n", howManyHouses(result));
    }

    public static boolean isAllValentines(int[] result) {
        int count = 0;
        for (int item : result) {
            if (item == 1)
                count++;
        }
        if (count == result.length)
            return true;
        else
            return false;
    }

    public static int howManyHouses(int[] result) {
        int count = 0;
        for (int item : result) {
            if (item == 0)
                count++;
        }
        return count;
    }
}
