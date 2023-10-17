package MethodsMore;

import java.util.Scanner;

public class some {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = "100000.89";
        String[] array = a.split("\\.");
        String result = array[0] + array[1];

    }
}
