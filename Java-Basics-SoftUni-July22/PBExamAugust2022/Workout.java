package PBExamAugust2022;

import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double kmRun = Double.parseDouble(scanner.nextLine());
        double current = 0;
        double totalRun = kmRun;
        double run = kmRun;

        for (int i = 1; i <= n ; i++) {
            int percent = Integer.parseInt(scanner.nextLine());
            current = run + (run * (percent * 1.0 / 100));
            run = current;
            totalRun = totalRun + run;
        }
        if (kmRun >= 1000)
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(totalRun-1000));
        else
            System.out.printf("Sorry Mrs. ivanova, you need to run %.0f more kilometers", Math.ceil(1000-totalRun));
    }
}
