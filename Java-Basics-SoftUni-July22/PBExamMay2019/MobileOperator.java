package PBExamMay2019;

import java.util.Scanner;

public class MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String period = scanner.nextLine();
        String type = scanner.nextLine();
        String extraNet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double total = 0;

        switch (type){
            case "Small":
                if (period.equals("one")) {
                    if (extraNet.equals("yes")){
                    total = months * (9.98 + 5.5);
                    } else total = months * 9.98;
                } else if (period.equals("two")) {
                    if (extraNet.equals("yes")){
                        total = months * (8.58 + 5.5);
                    } else total = months * 8.58;
                }
                break;
            case "Middle":
                if (period.equals("one")) {
                    if (extraNet.equals("yes")){
                        total = months * (18.99 + 4.35);
                    } else total = months * 18.99;
                } else if (period.equals("two")) {
                    if (extraNet.equals("yes")){
                        total = months * (17.09 + 4.35);
                    } else total = months * 17.09;
                }
                break;
            case "Large":
                if (period.equals("one")) {
                    if (extraNet.equals("yes")){
                        total = months * (25.98 + 4.35);
                    } else total = months * 25.98;
                } else if (period.equals("two")) {
                    if (extraNet.equals("yes")){
                        total = months * (23.59 + 4.35);
                    } else total = months * 23.59;
                }
                break;
            case "ExtraLarge":
                if (period.equals("one")) {
                    if (extraNet.equals("yes")){
                        total = months * (35.99 + 3.85);
                    } else total = months * 35.99;
                } else if (period.equals("two")) {
                    if (extraNet.equals("yes")){
                        total = months * (31.79 + 3.85);
                    } else total = months * 31.79;
                }
                break;
        }

        if (period.equals("two")) total = total * 0.9625;
        System.out.printf("%.2f lv.", total);
    }
}
