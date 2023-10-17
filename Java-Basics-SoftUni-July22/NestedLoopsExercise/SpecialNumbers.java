package NestedLoopsExercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999 ; i++) {
        int current = i;
        int counter = 0;
            for (int j = 4; j >= 1 ; j--) {
                int digit = current % 10;
                if (digit == 0)
                    continue;
                if (n % digit == 0)
                    counter++;
                current = current / 10;
            }
            if (counter == 4)
                System.out.print(i + " ");
        }
    }
}

//int n = Integer.ParseInt(scanner.NextLine());
//for (i = 1; i <= 9; i++) {
// for (j = 1; j <= 9; j++) {
//  for (k = 1; k <= 9; k++) {
//   for (l = 1; l <= 9; l++) {
//    If (n%i == 0 && n%j == 0 && n%k == 0 && n%l == 0)
//     System.out.printf("%d%d%d%d ", i, j, k, l);
//   }
//  }
// }
//}
