package CondStatLabExercise;

import java.util.Scanner;

public class Gorivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String gas = scanner.nextLine();
        double lit = Double.parseDouble(scanner.nextLine());
        if (gas.equals("Diesel")){
            if (lit>=25) System.out.println("You have enough diesel.");
            if (lit<25) System.out.println("Fill your tank with diesel!");
        }
        else if (gas.equals("Gasoline")){
             if (lit>=25) System.out.println("You have enough gasoline.");
             if (lit<25) System.out.println("Fill your tank with gasoline!");
        }
        else if (gas.equals("Gas")){
             if (lit>=25) System.out.println("You have enough gas.");
             if (lit<25) System.out.println("Fill your tank with gas!");
        }
        else System.out.println("Invalid fuel!");
    }
}
