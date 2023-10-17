package JavaAdvanced.StacksAndQueueLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> binary = new ArrayDeque<>();
        if (decimal == 0){
            System.out.println(0);
            return;
        }
        while (decimal > 0) {
            int digit = decimal % 2;
            decimal /= 2;
            binary.push(digit);
        }
        while (!binary.isEmpty()) {
            System.out.print(binary.pop());
        }
    }
}
