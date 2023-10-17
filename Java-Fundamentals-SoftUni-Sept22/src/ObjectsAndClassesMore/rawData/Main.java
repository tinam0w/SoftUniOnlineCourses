package ObjectsAndClassesMore.rawData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] inputLine = scanner.nextLine().split("\\s+");
            String model = inputLine[0];
            int engineSpeed = Integer.parseInt(inputLine[1]);
            int enginePower = Integer.parseInt(inputLine[2]);
            int cargoWeight = Integer.parseInt(inputLine[3]);
            String cargoType = inputLine[4];
            double tire1pres = Double.parseDouble(inputLine[5]);
            double tire2pres = Double.parseDouble(inputLine[7]);
            double tire3pres = Double.parseDouble(inputLine[9]);
            double tire4pres = Double.parseDouble(inputLine[11]);
            int tire1age = Integer.parseInt(inputLine[6]);
            int tire2age = Integer.parseInt(inputLine[8]);
            int tire3age = Integer.parseInt(inputLine[10]);
            int tire4age = Integer.parseInt(inputLine[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tire tires = new Tire(tire1pres, tire1age, tire2pres, tire2age, tire3pres, tire3age, tire4pres, tire4age);
            Car car = new Car(model, engine, cargo, tires);
            carList.add(car);
        }

        String command = scanner.nextLine();
        if (command.equals("fragile")) {
            for (Car car : carList) {
                if (car.getCargo().getType().equals(command)) {
                    if (car.getTires().isLessThan1()) {
                        System.out.println(car.getModel());
                    }
                }
            }
        } else if (command.equals("flamable")) {
            for (Car car : carList) {
                if (car.getCargo().getType().equals(command)) {
                    if (car.getEngine().getPower() > 250)
                        System.out.println(car.getModel());
                }
            }
        }
    }
}
