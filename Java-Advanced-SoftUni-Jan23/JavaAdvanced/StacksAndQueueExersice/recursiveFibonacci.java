package JavaAdvanced.StacksAndQueueExersice;

import java.util.Scanner;

public class recursiveFibonacci {
    public static long[] memory;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        memory = new long[n + 1];
        System.out.println(fibonaci(n));

    }

    public static long fibonaci(int n) {
        if (n <= 1) {
            return 1;
        }
        if (memory[n] != 0) {
            return memory[n];
        }
        long x = fibonaci(n - 1) + fibonaci(n - 2);
        memory[n] = x;
        return x;
    }
}

//1 1 2 3 5 8 13 21 34..
//f1 = f2 = 1
//f3 = f1 + f2
//f4 = f2 + f3
//f5 = f3 + f4

//    if n is 0
//            return 1
//     else if n is in lookup-table
//            return lookup-table-value-for-n
//     else
//            let x = factorial(n – 1) times n
//            store x in lookup-table in the nth slot
//            return x
//     end if
//            end function