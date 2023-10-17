package PolymorphismExersice.VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] carInput = scanner.nextLine().split("\\s+");
        String[] truckInput = scanner.nextLine().split("\\s+");
        String[] busInput = scanner.nextLine().split("\\s+");


        Vehicle car = new Car(Double.parseDouble(carInput[1]), Double.parseDouble(carInput[2]), Integer.parseInt(carInput[3]));
        Vehicle truck = new Truck(Double.parseDouble(truckInput[1]), Double.parseDouble(truckInput[2]), Integer.parseInt(truckInput[3]));
        Vehicle bus = new Bus(Double.parseDouble(busInput[1]), Double.parseDouble(busInput[2]), Integer.parseInt(busInput[3]));


        Map<String, Vehicle> map = new LinkedHashMap<>();
        map.put(carInput[0], car);
        map.put(truckInput[0], truck);
        map.put(busInput[0], bus);

        int count = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String commandName = command[0];
            String vehicleType = command[1];
            double argument = Double.parseDouble(command[2]);
            try {
                switch (commandName) {
                    case "Drive":
                        System.out.println(map.get(vehicleType).drive(argument));
                        break;
                    case "Refuel":
                        map.get(vehicleType).refuel(argument);
                        break;
                    case "DriveEmpty":
                        Bus bus2 = (Bus) map.get(vehicleType);
                        System.out.println(bus2.driveEmpty(argument));
                        break;
                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        map.values().forEach(System.out::println);
    }
}
