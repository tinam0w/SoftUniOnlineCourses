package FundMidExam;

import java.util.Scanner;

public class ExperienceGaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double experience = Double.parseDouble(scanner.nextLine());
        int battles = Integer.parseInt(scanner.nextLine());
        double gainExp = 0;
        boolean isOver = false;
        int countBattles = 0;
        for (int i = 1; i <= battles; i++) {
            double battleExp = Double.parseDouble(scanner.nextLine());
            countBattles++;
            if (i % 15 == 0)
                gainExp += battleExp * 1.05;
            else if (i % 5 == 0)
                gainExp += battleExp * 0.9;
            else if (i % 3 == 0)
                gainExp += battleExp * 1.15;
            else
                gainExp += battleExp;

            if (gainExp >= experience) {
                isOver = true;
                break;
            }
        }
        if (isOver){
            System.out.printf("Player successfully collected his needed experience for %d battles.", countBattles);
        } else {
            System.out.printf("Player was not able to collect the needed experience, %.2f more needed.", experience - gainExp);
        }
    }
}
