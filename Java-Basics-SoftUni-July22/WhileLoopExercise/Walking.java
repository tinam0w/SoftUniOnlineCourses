package WhileLoopExercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = 10000;
        int walked = 0;
        int total = 0;

        String input = scanner.nextLine();
        while (!input.equals("Going home")) {
            walked = Integer.parseInt(input);
            total = total + walked;
           if (total >= n)
               break;
            input = scanner.nextLine();
        }

        if (total >= n)
            System.out.printf("Goal reached! Good job!%n%d steps over the goal!", total - n);
        else {
            walked = Integer.parseInt(scanner.nextLine());
            total = total + walked;
            if (total >= n)
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", total - n);
            else
                System.out.printf("%d more steps to reach goal.", n - total);
        }
    }
}
