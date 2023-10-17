package DataTypesExercise;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstDay = Integer.parseInt(scanner.nextLine());
        int countDays = 0;
        int sum = 0;
        while (firstDay >= 100){
            int consume = firstDay - 26;
            sum += consume;
            firstDay -= 10;
            countDays++;
        }
        if (sum >= 26)
            System.out.printf("%d%n%d", countDays, sum - 26);
        else
            System.out.printf("%d%n%d", countDays, sum);
    }
}
