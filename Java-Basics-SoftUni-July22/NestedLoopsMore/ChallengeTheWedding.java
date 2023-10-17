package NestedLoopsMore;

import java.util.Scanner;

public class ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int men = Integer.parseInt(scanner.nextLine());
        int women = Integer.parseInt(scanner.nextLine());
        int tables = Integer.parseInt(scanner.nextLine());
        boolean isOver = false;

        for (int i = 1; i <= men ; i++) {
            for (int j = 1; j <= women ; j++) {
                tables--;
                if (tables < 0) {
                    isOver = true;
                    break;
                } else
                    System.out.printf("(%d <-> %d) ", i, j);
            }
            if (isOver)
                break;
        }
    }
}
