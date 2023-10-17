package CondStatAdvancedLab;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int num = Integer.parseInt(scanner.nextLine());
    boolean isInRange = (num >=100 && num <=200) || num == 0;

    if (!isInRange)
        System.out.println("invalid");
    }
}
