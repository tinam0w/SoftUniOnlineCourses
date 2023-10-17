package FinalExam03;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class NeedforSpeedIII1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> carMileage = new LinkedHashMap<>();
        Map<String, Integer> carFuel = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] car = scanner.nextLine().split("\\|");
            carMileage.put(car[0], Integer.parseInt(car[1]));
            carFuel.put(car[0], Integer.parseInt(car[2]));
        }
        String[] command = scanner.nextLine().split("\\s+:\\s+");
        while (!command[0].equals("Stop")) {
            String car = command[1];
            switch (command[0]) {
                case "Drive":
                    if (carFuel.get(car) < Integer.parseInt(command[3])) {
                        System.out.println("Not enough fuel to make that ride");
                    } else {
                        carMileage.put(car, carMileage.get(car) + Integer.parseInt(command[2]));
                        carFuel.put(car, carFuel.get(car) - Integer.parseInt(command[3]));
                        System.out.println(car + " driven for " + command[2] + " kilometers. " + command[3] + " liters of fuel consumed.");
                        if (carMileage.get(car) >= 100000) {
                            carMileage.remove(car);
                            carFuel.remove(car);
                            System.out.println("Time to sell the " + car + "!");
                        }
                    }
                    break;
                case "Refuel":
                    carFuel.put(car, carFuel.get(car) + Integer.parseInt(command[2]));
                    if (carFuel.get(car) > 75){
                        int diff = 75 - (carFuel.get(car) - Integer.parseInt(command[2]));
                        System.out.printf("%s refueled with %d liters%n", car, diff);
                        carFuel.put(car, 75);
                    } else {
                        System.out.printf("%s refueled with %d liters%n", car, Integer.parseInt(command[2]));
                    }
                    break;
                case "Revert":
                    int km = Integer.parseInt(command[2]);
                    if ((carMileage.get(car) - km) < 10000)
                        carMileage.put(car, 10000);
                    else {
                        carMileage.put(car, (carMileage.get(car) - km));
                        System.out.printf("%s mileage decreased by %d kilometers%n", car, km);
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+:\\s+");
        }
        for (Map.Entry<String, Integer> entry : carMileage.entrySet()) {
            System.out.println(entry.getKey() + " -> Mileage: " + entry.getValue() + " kms, Fuel in the tank: " + carFuel.get(entry.getKey()) + " lt.");
        }
    }
}
