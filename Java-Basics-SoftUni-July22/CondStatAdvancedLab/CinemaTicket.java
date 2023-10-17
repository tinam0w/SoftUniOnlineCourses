package CondStatAdvancedLab;

import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String day = scanner.nextLine();
        int ticket = 0;

        switch (day){
            case ("Monday"):
                ticket=12;
                break;
            case ("Tuesday"):
                ticket=12;
                break;
            case ("Wednesday"):
                ticket=14;
                break;
            case ("Thursday"):
                ticket=14;
                break;
            case ("Friday"):
                ticket=12;
                break;
            case ("Saturday"):
                ticket=16;
                break;
            case ("Sunday"):
                ticket=16;
                break;

        }
        System.out.println(ticket);
    }
}
