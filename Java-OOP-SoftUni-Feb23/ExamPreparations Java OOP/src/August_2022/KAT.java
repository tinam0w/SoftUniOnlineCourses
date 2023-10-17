package August_2022;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input1 = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> plates = new ArrayDeque<>();
        for (int plate : input1) {
            plates.offer(plate);
        }

        int[] input2 = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        Deque<Integer> cars = new ArrayDeque<>();
        for (int car : input2) {
            cars.push(car);
        }

        int days = 0, registeredCars = 0;

        while (!plates.isEmpty() && !cars.isEmpty()) {
            if (plates.peek() / 2 > cars.peek()) {
                registeredCars += cars.peek();
                int leftPlates = plates.poll() - (cars.pop() * 2);
                plates.offer(leftPlates);
            } else if (plates.peek() / 2 < cars.peek()) {
                int leftCars = cars.peek() - (plates.poll() / 2);
                registeredCars += cars.pop() - leftCars;
                cars.offer(leftCars);
            } else {
                registeredCars += cars.pop();
                plates.poll();
            }
            days++;
        }

        System.out.printf("%s cars were registered for %d days!%n", registeredCars, days);
        if (!plates.isEmpty()) {
            int leftPlates = 0;
            for (int plate : plates) {
                leftPlates += plate;
            }
            System.out.println(leftPlates + " license plates remain!");
        }
        if (!cars.isEmpty()) {
            int leftCars = 0;
            for (int car : cars) {
                leftCars += car;
            }
            System.out.println(leftCars + " cars remain without license plates!");
        }
        if (plates.isEmpty() && cars.isEmpty()){
            System.out.println("Good job! There is no queue in front of the KAT!");
        }
    }
}
