package WhileLoopExercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double sum = 0;
        int countAll = 0;
        int countPoor = 0;
        boolean check = false;
        String last = "";

        String name = scanner.nextLine();

        while (!name.equals("Enough")) {
            String current = name;
            double grade = Double.parseDouble(scanner.nextLine());
            last = current;
            countAll++;
            if (grade <= 4)
                countPoor++;

            sum = sum + grade;

            if (countPoor == n) {
                check = true;
                break;
            }

            name = scanner.nextLine();
        }

        if (check)
            System.out.printf("You need a break, %d poor grades.", countPoor);
        else
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", sum/countAll, countAll, last);
    }
}
