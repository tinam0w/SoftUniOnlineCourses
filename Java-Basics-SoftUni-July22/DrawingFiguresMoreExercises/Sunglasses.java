package DrawingFiguresMoreExercises;

import java.util.Scanner;

public class Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= 1 ; i++) {
            for (int j = 1; j <= 2*n ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= (n-2) ; i++) {
            System.out.print("*");
            for (int j = 0; j <= n+1 ; j++) {
                System.out.print("/");
            }
            System.out.println("*");

        }

        for (int i = 1; i <= 1 ; i++) {
            for (int j = 1; j <= 2*n ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*n ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

