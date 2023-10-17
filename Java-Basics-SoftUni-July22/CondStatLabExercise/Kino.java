package CondStatLabExercise;

import java.util.Scanner;

public class Kino {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String zala = scanner.nextLine();
        double bil = Double.parseDouble(scanner.nextLine());
        double res = 0.0;

        if (name.equals("A Star Is Born")){
            if (zala.equals("normal")) {
                res=bil*7.5;
                System.out.printf("A Star Is Born -> %.2f lv.",res);
            }
            if (zala.equals("luxury")) {
                res=bil*10.5;
                System.out.printf("A Star Is Born -> %.2f lv.",res);
            }
            if (zala.equals("ultra luxury")) {
                res=bil*13.5;
                System.out.printf("A Star Is Born -> %.2f lv.",res);
            }
        }
        if (name.equals("Bohemian Rhapsody")){
            if (zala.equals("normal")) {
                res=bil*7.35;
                System.out.printf("%s -> %.2f lv.",name,res);
            }
            if (zala.equals("luxury")) {
                res=bil*9.45;
                System.out.printf("%s -> %.2f lv.",name,res);
            }
            if (zala.equals("ultra luxury")) {
                res=bil*12.75;
                System.out.printf("%s -> %.2f lv.",name,res);
            }
        }
        if (name.equals("Green Book")){
            if (zala.equals("normal")) {
                res=bil*8.15;
                System.out.printf("%s -> %.2f lv.",name,res);
            }
            if (zala.equals("luxury")) {
                res=bil*10.25;
                System.out.printf("%s -> %.2f lv.",name,res);
            }
            if (zala.equals("ultra luxury")) {
                res=bil*13.25;
                System.out.printf("%s -> %.2f lv.",name,res);
            }
        }
        if (name.equals("The Favourite")){
            if (zala.equals("normal")) {
                res=bil*8.75;
                System.out.printf("%s -> %.2f lv.",name,res);
            }
            if (zala.equals("luxury")) {
                res=bil*11.55;
                System.out.printf("%s -> %.2f lv.",name,res);
            }
            if (zala.equals("ultra luxury")) {
                res=bil*13.95;
                System.out.printf("%s -> %.2f lv.",name,res);
            }
        }

    }
}
