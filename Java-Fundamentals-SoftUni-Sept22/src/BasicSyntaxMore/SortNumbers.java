package FundamentalsBasicMore;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int first = 0;
        int second = 0;
        int third = 0;

        if (a > b && a > c) {
            first = a;
            if (b > c) {
                second = b;
                third = c;
            } else {
                second = c;
                third = b;
            }
        } else if (b > c){
            first = b;
            if (a > c) {
                second = a;
                third = c;
            } else {
                second = c;
                third = a;
            }
        } else {
            first = c;
            if (b > a) {
                second = b;
                third = a;
            } else {
                second = a;
                third = b;
            }
        }
        System.out.printf("%d%n%d%n%d", first, second, third);
    }
}
