package PolymorphismExersice.Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split("\\s+");
        String[] truckInput = scanner.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]));
        Vehicle truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]));

        Map<String, Vehicle> map = new LinkedHashMap<>();
        map.put("Car", car);
        map.put("Truck", truck);

        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String commandName = command[0];
            String vehicleType = command[1];
            double argument = Double.parseDouble(command[2]);

            switch (commandName){
                case "Drive":
                    System.out.println(map.get(vehicleType).drive(argument));
                    break;
                case "Refuel":
                    map.get(vehicleType).refuel(argument);
                    break;
            }
        }
        map.values().forEach(System.out::println);
    }
}
