package PBExamApril2019;

import java.util.Scanner;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int red = 0;
        int orange = 0;
        int blue = 0;
        int green = 0;
        int max = 0;
        String maxColor = "";

        int eggs = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= eggs ; i++) {
            String color = scanner.nextLine();
            if (color.equals("red")) {
                red++;
                if (red > max) { max = red; maxColor = color; }
            }
            if (color.equals("orange")) {
                orange++;
                if (orange > max) { max = orange; maxColor = color; }
            }
            if (color.equals("blue")) {
                blue++;
                if (blue > max) { max = blue; maxColor = color; }
            }
            if (color.equals("green")) {
                green++;
                if (green > max) { max = green; maxColor = color; }
            }
        }

        System.out.printf("Red eggs: %d%n" +
                "Orange eggs: %d%n" +
                "Blue eggs: %d%n" +
                "Green eggs: %d%n" +
                "Max eggs: %d -> %s",red,orange,blue,green,max, maxColor);
    }
}
