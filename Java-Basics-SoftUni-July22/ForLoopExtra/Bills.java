package ForLoopExtra;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());
        double water = 20;
        double net = 15;
        double other = 0;
        double power = 0;
        double total = 0;

        for (int i = 1; i <= months ; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            power = power + electricity;
        }

        other = (power + (water*months) + (net*months)) * 1.2;
        total = power + (water*months) + (net*months) + other;

        System.out.printf("Electricity: %.2f lv%n", power);
        System.out.printf("Water: %.2f lv%n", water*months);
        System.out.printf("Internet: %.2f lv%n", net*months);
        System.out.printf("Other: %.2f lv%n", other);
        System.out.printf("Average: %.2f lv%n", total/months);
    }
}
