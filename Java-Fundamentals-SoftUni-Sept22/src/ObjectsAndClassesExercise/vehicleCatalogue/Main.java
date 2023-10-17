package ObjectsAndClassesExercise.vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> vehicleList = new ArrayList<>();
        String input = scanner.nextLine();
        while (!input.equals("End")){
            String type = input.split(" ")[0];
            String model = input.split(" ")[1];
            String color = input.split(" ")[2];
            int horsepower = Integer.parseInt(input.split(" ")[3]);
            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            vehicleList.add(vehicle);
            input = scanner.nextLine();
        }

        String requiredModel = scanner.nextLine();
        while (!requiredModel.equals("Close the Catalogue")){
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getModel().equals(requiredModel)){
                    System.out.println(vehicle);
                }
            }
            requiredModel = scanner.nextLine();
        }
        int countCars = 0;
        int countTrucks = 0;
        int allCarPowers = 0;
        int allTruckPowers = 0;
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getType().equals("car")){
                countCars++;
                allCarPowers += vehicle.getHorsepower();
            } else if (vehicle.getType().equals("truck")) {
                countTrucks++;
                allTruckPowers += vehicle.getHorsepower();
            }
        }

        double avCarPower = allCarPowers * 1.0 / countCars;
        double avTruckPower = allTruckPowers * 1.0 / countTrucks;
        if (countCars == 0) {
            avCarPower = 0;
        }
        if (countTrucks == 0){
            avTruckPower = 0;
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", avCarPower);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", avTruckPower);
    }
}
