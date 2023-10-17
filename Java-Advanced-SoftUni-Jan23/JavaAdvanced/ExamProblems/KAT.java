package JavaAdvanced.ExamProblems;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class KAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> plates = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> cars = Arrays.stream(scanner.nextLine().split(", ")).map(Integer::parseInt).collect(Collectors.toList());

        int days = 0;
        int registeredCars = 0;
        while (plates.size() > 0 && cars.size() > 0){
            if (cars.get(cars.size() - 1) < plates.get(0) / 2){
                registeredCars += cars.get(cars.size() - 1);
                int remainingPlates = ((plates.get(0) / 2) - cars.get(cars.size() - 1)) * 2;
                plates.add(remainingPlates);
            } else if (cars.get(cars.size() - 1) > plates.get(0) / 2) {
                int remainingCars = cars.get(cars.size() - 1) - (plates.get(0) / 2);
                registeredCars += cars.get(cars.size() - 1) - remainingCars;
                cars.add(0, remainingCars);
            } else {
                registeredCars += cars.get(cars.size() - 1);
            }
            cars.remove(cars.size() - 1);
            plates.remove(0);
            days++;
        }
        System.out.printf("%d cars were " +
                "registered for %d days!%n", registeredCars, days);
        if (plates.size() > 0){
            int remainingPlates = plates.stream().mapToInt(e -> e).sum();
            System.out.printf("%d license plates remain!%n", remainingPlates);
        }
        if (cars.size() > 0){
            int remainingCars = cars.stream().mapToInt(e -> e).sum();
            System.out.printf("%d cars remain without license plates!%n", remainingCars);
        }
        if (cars.size() == 0 && plates.size() == 0){
            System.out.println("Good job! There is no queue in front of the KAT!");
        }
    }
}
