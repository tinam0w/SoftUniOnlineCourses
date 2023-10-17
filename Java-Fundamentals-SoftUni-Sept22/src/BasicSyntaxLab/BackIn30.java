package FundamentalsBasicslab;

import java.util.Scanner;

public class BackIn30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        min = min + 30;
        if (min > 59){
            hour = hour + 1;
            min = min - 60;
        }
        if (hour == 24) hour = 0;
        if (hour > 24) hour = hour - 24;
        System.out.printf("%d:%02d", hour, min);
    }

}
