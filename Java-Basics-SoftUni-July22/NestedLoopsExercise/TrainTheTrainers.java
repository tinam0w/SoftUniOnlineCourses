package NestedLoopsExercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double studentsScores = 0;
        int count = 0;
        while (!input.equals("Finish")){
            String presentation = input;
            double sumScores = 0;
            for (int i = 1; i <= n ; i++) {
                double score = Double.parseDouble(scanner.nextLine());
                count++;
                sumScores += score;
            }
            studentsScores += sumScores;
            System.out.printf("%s - %.2f.%n", presentation, sumScores / n);
            input = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.", studentsScores / count);
    }
}
