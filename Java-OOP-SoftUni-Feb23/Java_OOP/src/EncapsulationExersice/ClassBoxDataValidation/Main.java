package EncapsulationExersice.ClassBoxDataValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();

        Box box = null;
        try {
            box = new Box(length, width, height);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        if (box != null){
            System.out.println(box);
        }
    }
}
