package PBExamsJuly2020;

import java.util.Scanner;

public class AluminumJoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int qnty = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String delivery = scanner.nextLine();
        double total = 0;
        switch (type){
            case "90X130":
                total = qnty * 110;
                if (qnty > 30 && qnty <= 60) total = total * 0.95;
                else if (qnty > 60) total = total * 0.92;
                break;
            case "100X150":
                total = qnty * 140;
                if (qnty > 40 && qnty <= 80) total = total * 0.94;
                else if (qnty > 80) total = total * 0.9;
                break;
            case "130X180":
                total = qnty * 190;
                if (qnty > 20 && qnty <= 50) total = total * 0.93;
                else if (qnty > 50) total = total * 0.88;
                break;
            case "200X300":
                total = qnty * 250;
                if (qnty > 25 && qnty <= 50) total = total * 0.91;
                else if (qnty > 50) total = total * 0.86;
                break;
        }
        if (delivery.equals("With delivery"))
            total = total + 60;
        if (qnty > 99)
            total = total * 0.96;
        if (qnty < 10)
            System.out.println("Invalid order");
        else
            System.out.printf("%.2f BGN", total);
    }
}
