package CondStatLabExercise;

import java.util.Scanner;

public class SleepyCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int PochDni = Integer.parseInt(scanner.nextLine());
        int RabDni = 365-PochDni;

        int Pigra = PochDni*127;
        int Rigra = RabDni*63;

        if ((Pigra+Rigra)<=30000) {
            int left = 30000-(Pigra+Rigra);
            int a = left/60;
            int b = left%60;
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play",a,b);
        }
        else {
            int left = (Pigra+Rigra)-30000;
            int a = left/60;
            int b = left%60;
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play",a,b);
        }


    }
}
