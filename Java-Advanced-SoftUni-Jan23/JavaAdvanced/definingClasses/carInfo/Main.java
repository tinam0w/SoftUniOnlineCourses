package JavaAdvanced.definingClasses.carInfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split("\\s+");
            Car car;
            if (parts.length > 1){
                car = new Car(parts[0], parts[1],Integer.parseInt(parts[2]) );
            } else {
                car = new Car(parts[0]);
            }
            System.out.println(car.carInfo());
        }
    }
}
