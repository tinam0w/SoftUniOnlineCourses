package nestedLoopsLab;

import java.util.Scanner;

public class SumofTwoNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int result = Integer.parseInt(scanner.nextLine());
        int count = 0;
        boolean check = false;

        for (int i = first; i <= second ; i++) {
            for (int j = first; j <= second ; j++) {
                count++;
                if ((i + j) == result){
                    System.out.printf("Combination N:%d ", count);
                    System.out.printf("(%d + %d = %d)%n", i, j, i+j);
                    check = true;
                    break;
                }
            }
            if (check)
                break;
        }
        if (!check)
            System.out.printf("%d combinations - neither equals %d", count, result);
    }
}
