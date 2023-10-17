package PBExamsMarch2019;

import java.util.Scanner;

public class Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String item = scanner.nextLine();

        double hardness = 0;
        double acting = 0;
        double total = 0;

        switch (country){
            case "Russia":
                if (item.equals("ribbon")){
                    hardness = hardness + 9.1;
                    acting = acting + 9.4;
                } else if (item.equals("hoop")) {
                    hardness = hardness + 9.3;
                    acting = acting + 9.8;
                } else if (item.equals("rope")) {
                    hardness = hardness + 9.6;
                    acting = acting + 9;
                }
                break;
            case "Bulgaria":
                if (item.equals("ribbon")){
                    hardness = hardness + 9.6;
                    acting = acting + 9.4;
                } else if (item.equals("hoop")) {
                    hardness = hardness + 9.55;
                    acting = acting + 9.75;
                } else if (item.equals("rope")) {
                    hardness = hardness + 9.5;
                    acting = acting + 9.4;
                }
                break;
            case "Italy":
                if (item.equals("ribbon")){
                    hardness = hardness + 9.2;
                    acting = acting + 9.5;
                } else if (item.equals("hoop")) {
                    hardness = hardness + 9.45;
                    acting = acting + 9.35;
                } else if (item.equals("rope")) {
                    hardness = hardness + 9.7;
                    acting = acting + 9.15;
                }
                break;
        }
        total = hardness + acting;
            System.out.printf("The team of %s get %.3f on %s.%n" +
                    "%.2f%%", country, total, item, 100-((total/20)*100));
    }
}
