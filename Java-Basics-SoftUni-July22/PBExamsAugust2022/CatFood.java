package PBExamsAugust2022;

import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cats = Integer.parseInt(scanner.nextLine());
        int smallCats = 0;
        int bigCats = 0;
        int hugeCats = 0;
        double totalFood = 0;

        for (int i = 1; i <= cats ; i++) {
            double food = Double.parseDouble(scanner.nextLine());
            totalFood += food;
            if (food >= 100 && food < 200)
                smallCats++;
            else if (food >= 200 && food < 300)
                bigCats++;
            else if (food >= 300 && food < 400)
                hugeCats++;
        }
        double cost = (totalFood / 1000) * 12.45;
        System.out.printf("Group 1: %d cats.%n" +
                "Group 2: %d cats.%n" +
                "Group 3: %d cats.%n", smallCats, bigCats, hugeCats);
        System.out.printf("Price for food per day: %.2f lv.", cost);
    }
}
