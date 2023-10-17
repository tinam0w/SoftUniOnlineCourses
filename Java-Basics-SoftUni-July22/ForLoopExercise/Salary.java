package ForLoopExercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n && i<=10; i++) {
                String site = scanner.nextLine();
                if (site.equals("Facebook")) salary = salary - 150;
                if (site.equals("Instagram")) salary = salary - 100;
                if (site.equals("Reddit")) salary = salary - 50;
            if (salary <= 0)
                break;
        }
        if (salary > 0)
            System.out.printf("%d", salary);
        else
            System.out.print("You have lost your salary.");
    }
}
