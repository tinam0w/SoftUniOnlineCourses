package PBExamsApril2019;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String type = scanner.nextLine();
        String VIP = scanner.nextLine();
        double days = Double.parseDouble(scanner.nextLine());
        double total = 0;
        boolean check = false;

        if (days > 7) days = days - 1;

        if (city.equals("Bansko") || city.equals("Borovets")) {
            switch (type){
                case "noEquipment":
                    if (VIP.equals("yes")){
                        total = (days * 80) * 0.95;
                    } else if (VIP.equals("no")) {
                        total = days * 80;
                    }
                    break;
                case "withEquipment":
                    if (VIP.equals("yes")){
                        total = (days * 100) * 0.9;
                    } else if (VIP.equals("no")) {
                        total = days * 100;
                    }
                    break;
                default:
                    check = true;
                    break;
            }
        } else if (city.equals("Varna") || city.equals("Burgas")) {
            switch (type){
                case "noBreakfast":
                    if (VIP.equals("yes")){
                        total = (days * 100) * 0.93;
                    } else if (VIP.equals("no")) {
                        total = days * 100;
                    }
                    break;
                case "withBreakfast":
                    if (VIP.equals("yes")){
                        total = (days * 130) * 0.88;
                    } else if (VIP.equals("no")) {
                        total = days * 130;
                    }
                    break;
                default:
                    check = true;
                    break;
            }
        } else
            check = true;

        if (check)
            System.out.println("Invalid input!");
        else if (days < 1)
            System.out.println("Days must be positive number!");
        else
            System.out.printf("The price is %.2flv! Have a nice time!", total);

        }
    }
