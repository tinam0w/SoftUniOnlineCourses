package CondStatLabExercise;

import java.util.Scanner;

public class DayNight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (day.equals("day")) {
            if (n < 20) System.out.printf("%.2f%n",(0.79*n+0.7));
            if ((n >= 20) && (n < 100)) System.out.printf("%.2f%n",(n*0.09));
            if (n>=100) System.out.printf("%.2f%n",(n*0.06));
        }
        if (day.equals("night")) {
            if (n < 20) System.out.printf("%.2f%n",(0.90*n+0.7));
            if ((n >= 20) && (n < 100)) System.out.printf("%.2f%n",(n*0.09));
            if (n>=100) System.out.printf("%.2f%n",(n*0.06));
        }
        }
    }

