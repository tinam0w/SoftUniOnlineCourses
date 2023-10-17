package PBExamApril2019;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int qnty = Integer.parseInt(scanner.nextLine());
        double total = 0;

        switch (size){
            case "Large":
                if (color.equals("Red")) total = qnty * 16;
                if (color.equals("Green")) total = qnty * 12;
                if (color.equals("Yellow")) total = qnty * 9;
                break;
            case "Medium":
                if (color.equals("Red")) total = qnty * 13;
                if (color.equals("Green")) total = qnty * 9;
                if (color.equals("Yellow")) total = qnty * 7;
                break;
            case "Small":
                if (color.equals("Red")) total = qnty * 9;
                if (color.equals("Green")) total = qnty * 8;
                if (color.equals("Yellow")) total = qnty * 5;
                break;
        }
        System.out.printf("%.2f leva.", total * 0.65);

    }
}
