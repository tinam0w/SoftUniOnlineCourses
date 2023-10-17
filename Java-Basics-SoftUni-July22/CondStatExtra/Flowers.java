package CondStatExtra;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hrizantemi = Double.parseDouble(scanner.nextLine());
        double rozi = Double.parseDouble(scanner.nextLine());
        double laleta = Double.parseDouble(scanner.nextLine());
        String sezon = scanner.nextLine();
        String praznik = scanner.nextLine();

        double totHrizan =0;
        double totRozi =0;
        double totLale =0;

        if (sezon.equals("Spring") || sezon.equals("Summer")){
            totHrizan=hrizantemi*2;
            totRozi=rozi*4.1;
            totLale=laleta*2.5;
        }
        else {
            totHrizan=hrizantemi*3.75;
            totRozi=rozi*4.5;
            totLale=laleta*4.15;
        }

        double total = totHrizan+totLale+totRozi;

        if (praznik.equals("Y")) total=total*1.15;

        if (sezon.equals("Spring") && laleta>7) total=total*0.95;
        if (sezon.equals("Winter") && rozi>=10) total=total*0.9;
        if ((hrizantemi+rozi+laleta)>20) total=total*0.8;

        System.out.printf("%.2f",total+2);


    }
}
