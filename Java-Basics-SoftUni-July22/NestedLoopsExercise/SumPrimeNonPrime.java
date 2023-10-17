package NestedLoopsExercise;

import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumPrime = 0;
        int sumNonPrime = 0;
        String input = scanner.nextLine();
        while (!input.equals("stop")){
            int number = Integer.parseInt(input);
            int count = 0;



            if (number < 0){
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }

            for (int i = 1; i <= number ; i++) {
                if (number % i == 0)
                    count++;
            }

            if (count == 2){
                sumPrime += number;
            }else
                sumNonPrime += number;

            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + sumPrime);
        System.out.println("Sum of all non prime numbers is: " + sumNonPrime);
    }
}
