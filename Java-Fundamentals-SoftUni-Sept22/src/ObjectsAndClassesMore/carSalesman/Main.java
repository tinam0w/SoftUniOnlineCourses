package ObjectsAndClassesMore.carSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> carList = new ArrayList<>();
        List<Engine> engineList = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            Engine engine = new Engine();
            engine.setModel(input[0]);
            engine.setPower(Integer.parseInt(input[1]));
            if (input.length > 2) {
                if (input[2].charAt(0) >= 48 && input[2].charAt(0) <= 57) {
                    engine.setDisplacement(Integer.parseInt(input[2]));
                    if (input.length == 4) {
                        engine.setEfficiency(input[3]);
                    }
                } else {
                    engine.setEfficiency(input[2]);
                }
            }
            engineList.add(engine);
        }


        int m = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= m; i++) {
            String[] input1 = scanner.nextLine().split("\\s+");
            Car car = new Car();
            car.setModel(input1[0]);
            car.setEngine(input1[1]);
            if (input1.length > 2) {
                if (input1[2].charAt(0) >= 48 && input1[2].charAt(0) <= 57) {
                    car.setWeight(Integer.parseInt(input1[2]));
                    if (input1.length == 4) {
                        car.setColor(input1[3]);
                    }
                } else {
                    car.setColor(input1[2]);
                }
            }
            carList.add(car);
        }

        for (Car car : carList) {
            for (Engine engine : engineList) {
                if (car.getEngine().equals(engine.getModel())) {

                    String carWeight = "" + car.getWeight();
                    if (car.getWeight() == -1)
                        carWeight = "n/a";

                    String engineDisplacement = "" + engine.getDisplacement();
                    if (engine.getDisplacement() == -1)
                        engineDisplacement = "n/a";

                    System.out.println(car.getModel() + ":");
                    System.out.println("  " + engine.getModel() + ":");
                    System.out.println("    Power: " + engine.getPower());
                    System.out.println("    Displacement: " + engineDisplacement);
                    System.out.println("    Efficiency: " + engine.getEfficiency());
                    System.out.println("  Weight: " + carWeight);
                    System.out.println("  Color: " + car.getColor());
                }
            }
        }
    }
}