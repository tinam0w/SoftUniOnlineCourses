package PBExamsMarch2019;

import java.util.Scanner;

public class TennisEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double racketPrice = Double.parseDouble(scanner.nextLine());
        int rackets = Integer.parseInt(scanner.nextLine());
        int shoes = Integer.parseInt(scanner.nextLine());

        double total = (racketPrice * rackets) + (shoes * (racketPrice/6));
        total = total + (total * 0.2);

        System.out.printf("Price to be paid by Djokovic %.0f%n", Math.floor(total / 8));
        System.out.printf("Price to be paid by sponsors %.0f%n", Math.ceil(total*7 / 8));
    }
}
