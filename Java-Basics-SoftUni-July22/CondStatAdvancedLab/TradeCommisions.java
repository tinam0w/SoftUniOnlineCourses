package CondStatAdvancedLab;

import java.util.Scanner;

public class TradeCommisions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        double turnover = Double.parseDouble(scanner.nextLine());
        double commision = 0;
        boolean isInvalid = false;

        switch (city){
            case "Sofia":
                if (turnover>0 && turnover<=500)
                    commision=turnover*0.05;
                 else if (turnover>500 && turnover<=1000)
                    commision=turnover*0.07;
                 else if (turnover>1000 && turnover<=10000)
                    commision=turnover*0.08;
                else if (turnover>10000)
                    commision=turnover*0.12;
                else isInvalid=true;
                break;
            case "Varna":
                if (turnover>0 && turnover<=500){
                    commision=turnover*0.045;
                } else if (turnover>500 && turnover<=1000) {
                    commision=turnover*0.075;
                } else if (turnover>1000 && turnover<=10000) {
                    commision=turnover*0.1;
                }
                else if (turnover>10000)
                    commision=turnover*0.13;
                else isInvalid=true;
                break;
            case "Plovdiv":
                if (turnover>0 && turnover<=500){
                    commision=turnover*0.055;
                } else if (turnover>500 && turnover<=1000) {
                    commision=turnover*0.08;
                } else if (turnover>1000 && turnover<=10000) {
                    commision=turnover*0.12;
                }
                else if (turnover>10000)
                    commision=turnover*0.145;
                else isInvalid=true;
                break;
            default:
                isInvalid=true;
        }

        if (isInvalid)
            System.out.println("error");
        else
        System.out.printf("%.2f",commision);
    }
}
