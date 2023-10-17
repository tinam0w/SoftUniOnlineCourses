package JavaAdvanced.definingClassesExersice.SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> carsMap = new LinkedHashMap<>();

        int countCars = 0;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double priceFuelKm = Double.parseDouble(data[2]);

            Car car = new Car(model, fuelAmount, priceFuelKm);
            carsMap.put(model, car);
            countCars++;
        }

        String command = scanner.nextLine();
        while (!command.equals("End")){
            String modelToDrive = command.split("\\s+")[1];
            int kmToDrive = Integer.parseInt(command.split("\\s+")[2]);

            Car carToDrive = carsMap.get(modelToDrive);
            if (!carToDrive.drive(kmToDrive)){
                System.out.println("Insufficient fuel for the drive");
            }
            command = scanner.nextLine();
        }

        for (Car car : carsMap.values()){
            System.out.println(car);
        }
    }
}
