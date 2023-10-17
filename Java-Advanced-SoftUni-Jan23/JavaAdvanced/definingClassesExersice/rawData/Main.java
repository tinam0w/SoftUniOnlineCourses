package JavaAdvanced.definingClassesExersice.rawData;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Car, String> carMap = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            int speed = Integer.parseInt(input[1]);
            int power = Integer.parseInt(input[2]);
            int weight = Integer.parseInt(input[3]);
            String type = input[4];
            double tire1pressure = Double.parseDouble(input[5]);
            int tire1age = Integer.parseInt(input[6]);
            double tire2pressure = Double.parseDouble(input[7]);
            int tire2age = Integer.parseInt(input[8]);
            double tire3pressure = Double.parseDouble(input[9]);
            int tire3age = Integer.parseInt(input[10]);
            double tire4pressure = Double.parseDouble(input[11]);
            int tire4age = Integer.parseInt(input[12]);
            Engine engine = new Engine(speed, power);
            Cargo cargo = new Cargo(weight, type);
            Tire tires = new Tire(tire1pressure, tire1age, tire2pressure, tire2age, tire3pressure, tire3age, tire4pressure, tire4age);
            Car car = new Car(model, engine, cargo, tires);
            carMap.put(car, type);
        }

        String command = scanner.nextLine();
        if (command.equals("fragile")){
            isFragile(carMap);
        } else if (command.equals("flamable")) {
            isFlamable(carMap);
        }
    }

    private static void isFlamable(Map<Car, String> carMap) {
        for (Map.Entry<Car, String> entry : carMap.entrySet()) {
            if (entry.getValue().equals("flamable")){
                if (entry.getKey().getEngine().getPower() > 250){
                    System.out.println(entry.getKey().getModel());
                }
            }
        }
    }

    private static void isFragile(Map<Car, String> carMap) {
        for (Map.Entry<Car, String> entry : carMap.entrySet()) {
            if (entry.getValue().equals("fragile")){
                double[] pressures = entry.getKey().getTiresPressure();
                for (int i = 0; i < pressures.length; i++) {
                    if (pressures[i] < 1){
                        System.out.println(entry.getKey().getModel());
                        break;
                    }
                }
            }
        }
    }
}
