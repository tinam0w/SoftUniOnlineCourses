package PBExamsJune2019;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String menu = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());
        double total = 0;

        switch (movie){
            case "John Wick":
                if (menu.equals("Drink")){
                    total = tickets * 12;
                } else if (menu.equals("Popcorn")) {
                    total = tickets * 15;
                } else if (menu.equals("Menu")) {
                    total = tickets * 19;
                }
                break;
            case "Star Wars":
                if (menu.equals("Drink")){
                    total = tickets * 18;
                } else if (menu.equals("Popcorn")) {
                    total = tickets * 25;
                } else if (menu.equals("Menu")) {
                    total = tickets * 30;
                }
                if (tickets >= 4) total = total * 0.7;
                break;
            case "Jumanji":
                if (menu.equals("Drink")){
                    total = tickets * 9;
                } else if (menu.equals("Popcorn")) {
                    total = tickets * 11;
                } else if (menu.equals("Menu")) {
                    total = tickets * 14;
                }
                if (tickets == 2) total = total * 0.85;
                break;
        }
        System.out.printf("Your bill is %.2f leva.", total);
    }
}
