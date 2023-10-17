package PBExamsMarch2020;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double musala = 0;
        double monblan = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;
        double all = 0;
        int groups = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= groups ; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            all += people;
            if (people <= 5) musala += people;
            else if (people <= 12) monblan += people;
            else if (people <= 25) kilimanjaro += people;
            else if (people <= 40) k2 += people;
            else if (people > 40) everest += people;
        }
        System.out.printf("%.2f%%%n", (musala/all)*100);
        System.out.printf("%.2f%%%n", (monblan/all)*100);
        System.out.printf("%.2f%%%n", (kilimanjaro/all)*100);
        System.out.printf("%.2f%%%n", (k2/all)*100);
        System.out.printf("%.2f%%%n", (everest/all)*100);
    }
}
