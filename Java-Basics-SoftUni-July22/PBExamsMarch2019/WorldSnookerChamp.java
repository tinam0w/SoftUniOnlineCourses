package PBExamsMarch2019;

import java.util.Scanner;

public class WorldSnookerChamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticket = scanner.nextLine();
        int qnty = Integer.parseInt(scanner.nextLine());
        String trophy = scanner.nextLine();
        double total = 0;

        switch (stage){
            case "Quarter final":
                if (ticket.equals("Standard")){
                    total = qnty * 55.5;
                } else if (ticket.equals("Premium")) {
                    total = qnty * 105.2;
                } else if (ticket.equals("VIP")) {
                    total = qnty * 118.9;
                }
                break;
            case "Semi final":
                if (ticket.equals("Standard")){
                    total = qnty * 75.88;
                } else if (ticket.equals("Premium")) {
                    total = qnty * 125.22;
                } else if (ticket.equals("VIP")) {
                    total = qnty * 300.4;
                }
                break;
            case "Final":
                if (ticket.equals("Standard")){
                    total = qnty * 110.1;
                } else if (ticket.equals("Premium")) {
                    total = qnty * 160.66;
                } else if (ticket.equals("VIP")) {
                    total = qnty * 400;
                }
                break;
        }


        if (total > 4000) {
            total = total * 0.75;
            trophy = "N";
        } else if (total > 2500)
            total = total * 0.9;

        if (trophy.equals("Y"))
            total = total + (qnty * 40);

        System.out.printf("%.2f", total);

    }
}
