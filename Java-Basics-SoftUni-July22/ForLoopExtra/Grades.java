package ForLoopExtra;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double top = 0;
        double fourUp = 0;
        double treeUp = 0;
        double fail = 0;
        double allGrades = 0;

        for (int i = 1; i <= n ; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade < 3) fail = fail + 1;
            else if (grade < 4) treeUp = treeUp + 1;
            else if (grade < 5) fourUp = fourUp + 1;
            else if (grade >= 5) top = top + 1;
            allGrades = allGrades + grade;
        }

        System.out.printf("Top students: %.2f%%%n", (top/n)*100);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", (fourUp/n)*100);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", (treeUp/n)*100);
        System.out.printf("Fail: %.2f%%%n", (fail/n)*100);
        System.out.printf("Average: %.2f", allGrades/n);
    }
}
