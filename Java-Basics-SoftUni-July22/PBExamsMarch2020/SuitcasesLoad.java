package PBExamsMarch2020;

import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        double takenSpace = 0;
        int countCases = 0;
        boolean isOver = false;
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            double suitcase = Double.parseDouble(input);
            countCases++;
            if (countCases % 3 == 0)
                suitcase = suitcase * 1.1;
            if (suitcase > (capacity - takenSpace)) {
                isOver = true;
                countCases = countCases - 1;
                break; }
                takenSpace += suitcase;
                input = scanner.nextLine();
            }
            if (isOver)
                System.out.println("No more space!");
            else
                System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", countCases);
        }
    }
