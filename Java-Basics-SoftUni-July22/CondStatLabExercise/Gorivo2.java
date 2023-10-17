package CondStatLabExercise;

import java.util.Scanner;

public class Gorivo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gas = scanner.nextLine();
        double qnty = Double.parseDouble(scanner.nextLine());
        String card = scanner.nextLine();
        double total = 0;

        if (card.equals("Yes")){
            if (qnty>=20 && qnty<=25){
                if (gas.equals("Gas"))  total = (qnty*(0.93-0.08))*0.92;
                else if (gas.equals("Diesel")) total=(qnty*(2.33-0.12))*0.92;
                else if (gas.equals("Gasoline")) total=(qnty*(2.22-0.18))*0.92;
            }
            else if (qnty >25){
                if (gas.equals("Gas"))  total = (qnty*(0.93-0.08))*0.9;
                else if (gas.equals("Diesel")) total=(qnty*(2.33-0.12))*0.9;
                else if (gas.equals("Gasoline")) total=(qnty*(2.22-0.18))*0.9;
            }
            else {
                if (gas.equals("Gas"))  total = qnty*(0.93-0.08);
                else if (gas.equals("Diesel")) total=qnty*(2.33-0.12);
                else if (gas.equals("Gasoline")) total=qnty*(2.22-0.18);
            }
            }
        else if (card.equals("No")){
            if (qnty>=20 && qnty<=25){
                if (gas.equals("Gas"))  total = qnty*0.93*0.92;
                else if (gas.equals("Diesel")) total=qnty*2.33*0.92;
                else if (gas.equals("Gasoline")) total=qnty*2.22*0.92;
            }
            else if (qnty >25){
                if (gas.equals("Gas"))  total = qnty*0.93*0.9;
                else if (gas.equals("Diesel")) total=qnty*2.33*0.9;
                else if (gas.equals("Gasoline")) total=qnty*2.22*0.9;
            }
            else {
                if (gas.equals("Gas"))  total = qnty*0.93;
                else if (gas.equals("Diesel")) total=qnty*2.33;
                else if (gas.equals("Gasoline")) total=qnty*2.22;
            }
        }
        System.out.printf("%.2f lv.",total);
        }
    }

