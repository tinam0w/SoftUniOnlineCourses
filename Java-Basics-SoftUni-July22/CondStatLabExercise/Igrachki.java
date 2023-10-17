package CondStatLabExercise;

import java.util.Scanner;

public class Igrachki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double trip = Double.parseDouble(scanner.nextLine());
        double puzzel = Double.parseDouble(scanner.nextLine());
        double doll = Double.parseDouble(scanner.nextLine());
        double teddy = Double.parseDouble(scanner.nextLine());
        double minion = Double.parseDouble(scanner.nextLine());
        double truck = Double.parseDouble(scanner.nextLine());

        double broj = puzzel+doll+teddy+minion+truck;
        double total = (puzzel*2.6 + doll*3 + teddy*4.1 + minion*8.2 + truck*2)*0.9;

        if (broj >= 50) total = total*0.75;

        if (total>=trip) System.out.printf("Yes! %.2f lv left.", (total-trip));
        else System.out.printf("Not enough money! %.2f lv needed.",(trip-total));
        }
    }
