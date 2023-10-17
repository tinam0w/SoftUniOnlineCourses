package PBExamMay2019;

import java.util.Scanner;

public class DivWithoutRem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noReminder2 = 0;
        int noReminder3 = 0;
        int noReminder4 = 0;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input % 2 == 0) noReminder2++;
            if (input % 3 == 0) noReminder3++;
            if (input % 4 == 0) noReminder4++;
        }

        System.out.printf("%.2f%%%n",(noReminder2*1.0/n)*100);
        System.out.printf("%.2f%%%n",(noReminder3*1.0/n)*100);
        System.out.printf("%.2f%%%n",(noReminder4*1.0/n)*100);
    }
}
