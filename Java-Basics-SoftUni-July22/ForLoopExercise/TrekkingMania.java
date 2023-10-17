package ForLoopExercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());
        double percent = 0;
        int total = 0;
        int g1 = 0;
        int g2 = 0;
        int g3 = 0;
        int g4 = 0;
        int g5 = 0;

        for (int i = 1; i <= groups ; i++) {
            int ppl = Integer.parseInt(scanner.nextLine());
            total = total + ppl;
            if (ppl <= 5) g1 = g1 + ppl;
            else if (ppl <= 12) g2 = g2 + ppl;
            else if (ppl <= 25) g3 = g3 + ppl;
            else if (ppl <= 40) g4 = g4 + ppl;
            else g5 = g5 + ppl;
        }

        System.out.printf("%.2f%%%n", (g1*1.0/total)*100);
        System.out.printf("%.2f%%%n", (g2*1.0/total)*100);
        System.out.printf("%.2f%%%n", (g3*1.0/total)*100);
        System.out.printf("%.2f%%%n", (g4*1.0/total)*100);
        System.out.printf("%.2f%%%n", (g5*1.0/total)*100);

    }
}
