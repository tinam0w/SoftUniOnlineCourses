package PBExamsMarch2019;

import java.util.Scanner;

public class HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countGood = 0;
        int countFailed = 0;
        int countAllFailed = 0;
        boolean check = false;

        int target = Integer.parseInt(scanner.nextLine());
        int level = 0;

        for (level = target-30; ; ) {
            int currentJump = Integer.parseInt(scanner.nextLine());
            if (currentJump > level) {
                countGood++;
                countFailed = 0;
                if (level >= target)
                    break;
                else
                    level = level + 5;
            } else {
                countFailed++;
                countAllFailed++;
                if (countFailed == 3) {
                    check = true;
                    break;
                }
            }
        }
        if (check)
                System.out.printf("Tihomir failed at %dcm after %d jumps.", level,countAllFailed+countGood);
        else
                System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", level, countAllFailed+countGood);
    }
}
