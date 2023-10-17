package ForLoopExtra;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int fans = Integer.parseInt(scanner.nextLine());
        int total = 0;
        int A = 0;
        int B = 0;
        int V = 0;
        int G = 0;

        for (int i = 1; i <= fans ; i++) {
            String section = scanner.nextLine();
            if (section.equals("A")) A++;
            if (section.equals("B")) B++;
            if (section.equals("V")) V++;
            if (section.equals("G")) G++;
        }

        total = A+B+V+G;
        System.out.printf("%.2f%%%n", (A*1.0/total)*100 );
        System.out.printf("%.2f%%%n", (B*1.0/total)*100 );
        System.out.printf("%.2f%%%n", (V*1.0/total)*100 );
        System.out.printf("%.2f%%%n", (G*1.0/total)*100 );
        System.out.printf("%.2f%%%n", (total*1.0/capacity)*100 );

    }
}
