package ForLoopExtra;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double total = 0;
        double from0 = 0;
        double from10 = 0;
        double from20 = 0;
        double from30 = 0;
        double from40 = 0;
        double invalid = 0;

        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number >= 0 && number <= 9){
                from0 = from0 + 1;
                total = total + number*0.2;
            }
            else if (number >= 10 && number <= 19) {
                from10 = from10 + 1;
                total = total + number*0.3;
            }
            else if (number >= 20 && number <= 29) {
                from20 = from20 + 1;
                total = total + number*0.4;
            }
            else if (number >= 30 && number <= 39) {
                from30 = from30 + 1;
                total = total + 50;
            }
            else if (number >= 40 && number <= 50) {
                from40 = from40 + 1;
                total = total + 100;
            }
            else {
                invalid = invalid + 1;
                total = total / 2;
            }
        }

        double all = from0+from10+from20+from30+from40+invalid;
        System.out.printf("%.2f%n", total);
        System.out.printf("From 0 to 9: %.2f%%%n", (from0/all)*100);
        System.out.printf("From 10 to 19: %.2f%%%n", (from10/all)*100);
        System.out.printf("From 20 to 29: %.2f%%%n", (from20/all)*100);
        System.out.printf("From 30 to 39: %.2f%%%n", (from30/all)*100);
        System.out.printf("From 40 to 50: %.2f%%%n", (from40/all)*100);
        System.out.printf("Invalid numbers: %.2f%%%n", (invalid/all)*100);

    }
}
