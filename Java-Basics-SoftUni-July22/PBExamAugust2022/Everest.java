package PBExamAugust2022;

import java.util.Scanner;

public class Everest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = 1; //max 5 days
        int start = 5364;
        int everest = 8848;
        int totalClimb = start;
        boolean isClimbed = false;

        String night = scanner.nextLine();
        while (!night.equals("END")){
            int currentClimb = Integer.parseInt(scanner.nextLine());
            if (night.equals("Yes")) days++;
            totalClimb += currentClimb;
            if (totalClimb >= everest){
                isClimbed = true;
                break;
            }
            if (days == 5) break;
            night = scanner.nextLine();
        }
         if (isClimbed)
             System.out.printf("Goal reached for %d days!", days);
         else
             System.out.printf("Failed!%n%d", totalClimb);
    }
}
