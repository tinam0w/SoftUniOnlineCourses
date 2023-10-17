package nestedLoopsLab;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int levels = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());
        int count = 0;

        for (int i = levels; i >= 1 ; i--) {
            for (int j = rooms; j >= 1 ; j--)
                if (i == levels) {
                    System.out.printf("L%d%d ",i,count);
                    count++;
                } else if (i % 2 == 0) {
                    System.out.printf("O%d%d ",i,count);
                    count++;
                } else {
                    System.out.printf("A%d%d ",i,count);
                    count++;
                }
            System.out.println();
            count = 0;
        }
    }
}
