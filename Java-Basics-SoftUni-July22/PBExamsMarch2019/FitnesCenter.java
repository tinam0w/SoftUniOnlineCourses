package PBExamsMarch2019;

import java.util.Scanner;

public class FitnesCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());
        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int shake = 0;
        int bar = 0;

        for (int i = 1; i <= visitors ; i++) {
            String activity = scanner.nextLine();
            switch (activity){
                case "Back":
               back++;
                    break;
                case "Chest":
                chest++;
                    break;
                case "Legs":
                legs++;
                    break;
                case "Abs":
                abs++;
                    break;
                case "Protein shake":
                shake++;
                    break;
                case "Protein bar":
                bar++;
                    break;

            }
        }

        double workOut = ((back + chest + legs + abs)*1.0 / visitors) * 100;
        System.out.printf("%d - back%n",back);
        System.out.printf("%d - chest%n",chest);
        System.out.printf("%d - legs%n",legs);
        System.out.printf("%d - abs%n",abs);
        System.out.printf("%d - protein shake%n",shake);
        System.out.printf("%d - protein bar%n",bar);
        System.out.printf("%.2f%% - work out%n",workOut);
        System.out.printf("%.2f%% - protein%n",((shake + bar)*1.0 / visitors) * 100);
    }
}
