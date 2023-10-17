package CondStatLabExercise;

import java.util.Scanner;

public class LicaFiguri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();

         if (type.equals("square"))
         {
             Double a = Double.parseDouble(scanner.nextLine());
             double res = a*a;
             System.out.printf("%.3f", res);
         }
         else if (type.equals("rectangle")) {
             Double a = Double.parseDouble(scanner.nextLine());
             Double b = Double.parseDouble(scanner.nextLine());
             Double res = a*b;
             System.out.printf("%.3f",res);}
         else if (type.equals("circle")){
             Double a = Double.parseDouble(scanner.nextLine());
             Double res = a*a*Math.PI;
             System.out.printf("%.3f", res);}
         else if (type.equals("triangle")) {
             Double a = Double.parseDouble(scanner.nextLine());
             Double b = Double.parseDouble(scanner.nextLine());
             Double res = (a*b)/2;
             System.out.printf("%.3f",res);}


    }
}
