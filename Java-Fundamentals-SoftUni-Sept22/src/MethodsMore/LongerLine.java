package MethodsMore;

import java.util.Scanner;

public class LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double longerLine = 0;
        int x1longer = 0;
        int x2longer = 0;
        int y1longer = 0;
        int y2longer = 0;

        for (int i = 1; i <= 2; i++) {
            int x1 = Integer.parseInt(scanner.nextLine());
            int y1 = Integer.parseInt(scanner.nextLine());
            int x2 = Integer.parseInt(scanner.nextLine());
            int y2 = Integer.parseInt(scanner.nextLine());

            double currentLine = makeLine(x1, x2, y1, y2);

            if (currentLine > longerLine) {
                longerLine = currentLine;
                x1longer = x1;
                x2longer = x2;
                y1longer = y1;
                y2longer = y2;
            }
        }

         pointsToCenter(x1longer, x2longer, y1longer, y2longer);
    }

    public static double makeLine(int x1, int x2, int y1, int y2) {
        return Math.sqrt(((Math.pow(x2 - x1, 2) + (Math.pow(y2 - y1, 2)))));
    }

    public static void pointsToCenter(int x1, int x2, int y1, int y2){
        double firstLine = Math.sqrt( (Math.pow(x1,2) + Math.pow(y1,2) ));
        double secondLine = Math.sqrt( (Math.pow(x2,2) + Math.pow(y2,2) ));

        if (firstLine < secondLine)
            System.out.printf("(%d, %d)(%d, %d)", x1, y1, x2, y2);
        else
            System.out.printf("(%d, %d)(%d, %d)", x2, y2, x1, y1);
    }
}
