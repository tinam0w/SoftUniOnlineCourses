package FinalExam03;

import java.util.*;

public class NeedForSpeedIII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Integer>> carsMap = new LinkedHashMap();
        for (int i = 1; i <= n; i++) {
            String[] car = scanner.nextLine().split("\\|");
            carsMap.putIfAbsent(car[0], new ArrayList<>());
            carsMap.get(car[0]).add(Integer.parseInt(car[1]));
            carsMap.get(car[0]).add(Integer.parseInt(car[2]));
        }

        String[] command = scanner.nextLine().split("\\s+:\\s+");
        while (!command[0].equals("Stop")) {
            String car = command[1];
            switch (command[0]) {
                case "Drive":
                    int distance = Integer.parseInt(command[2]);
                    int fuel = Integer.parseInt(command[3]);
                    if (carsMap.get(car).get(1) >= fuel) {
                        carsMap.get(car).set(0, carsMap.get(car).get(0) + distance);
                        carsMap.get(car).set(1, carsMap.get(car).get(1) - fuel);
                        System.out.println(car + " driven for " + distance + " kilometers. " + fuel + " liters of fuel consumed.");
                        if (carsMap.get(car).get(0) >= 100000){
                            System.out.println("Time to sell the " + car + "!");
                            carsMap.remove(car);
                        }
                    } else {
                        System.out.println("Not enough fuel to make that ride");
                    }
                    break;
                case "Refuel":
                    int refill = Integer.parseInt(command[2]);
                    if (carsMap.get(car).get(1) + refill > 75) {
                        System.out.println(car + " refueled with " + (75 - carsMap.get(car).get(1)) + " liters");
                        carsMap.get(car).set(1, 75);
                    } else {
                        System.out.println(car + " refueled with " + refill + " liters");
                        carsMap.get(car).set(1, carsMap.get(car).get(1) + refill);
                    }
                    break;
                case "Revert":
                    int km = Integer.parseInt(command[2]);
                    if ((carsMap.get(car).get(0) - km) >= 10000) {
                        System.out.println(car + " mileage decreased by " + km + " kilometers");
                        carsMap.get(car).set(0, (carsMap.get(car).get(0) - km));
                    } else {
                        carsMap.get(car).set(0, 10000);
                    }
                    break;
            }
            command = scanner.nextLine().split("\\s+:\\s+");
        }

        for (Map.Entry<String, List<Integer>> entry : carsMap.entrySet()) {
            System.out.println(entry.getKey() + " -> Mileage: " + entry.getValue().get(0) + " kms, Fuel in the tank: " + entry.getValue().get(1) + " lt.");
        }
    }
}
