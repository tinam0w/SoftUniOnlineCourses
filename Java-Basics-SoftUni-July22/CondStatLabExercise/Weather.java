package CondStatLabExercise;

import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double deg = Double.parseDouble(scanner.nextLine());

       if (deg>=26 && deg <=35)
           System.out.println("Hot");
       else if (deg>=20.1 && deg<=25.9)
           System.out.println("Warm");
       else if (deg>=15 && deg<=20)
           System.out.println("Mild");
       else if (deg>=12 && deg<=14.9)
           System.out.println("Cool");
       else if (deg>=5 && deg<=11.9)
           System.out.println("Cold");
       else
           System.out.println("unknown");
    }
}