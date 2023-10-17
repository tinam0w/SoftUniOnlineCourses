package ForLoopExercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int points = Integer.parseInt(scanner.nextLine());
        int totalW = 0;
        int totalF = 0;
        int totalSF = 0;
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;

        for (int i = 1; i <= tournaments ; i++) {
            String stage = scanner.nextLine();
            if (stage.equals("W")) {
                totalW = totalW + 2000;
                p1++;
            } else if (stage.equals("F")) {
                totalF = totalF + 1200;
                p2++;
            } else if (stage.equals("SF")) {
                totalSF = totalSF + 720;
                p3++;
            }
        }

        System.out.printf("Final points: %d%n",(totalW+totalF+totalSF+points));
        System.out.printf("Average points: %.0f%n", Math.floor((totalF+totalW+totalSF)*1.0/tournaments));
        System.out.printf("%.2f%%", (p1/(p1+p2+p3)*100));
    }
}
