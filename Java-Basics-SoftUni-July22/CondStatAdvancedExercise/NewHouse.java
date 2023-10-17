package CondStatAdvancedExercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowers = scanner.nextLine();
        int qntyFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double total = 0;

        if (flowers.equals("Roses"))
            total=qntyFlowers*5;
        else if (flowers.equals("Dahlias"))
            total=qntyFlowers*3.8;
        else if (flowers.equals("Tulips"))
            total=qntyFlowers*2.8;
        else if (flowers.equals("Narcissus"))
            total=qntyFlowers*3;
        else if (flowers.equals("Gladiolus"))
            total=qntyFlowers*2.5;

        if (flowers.equals("Roses") && qntyFlowers>80)
            total=total*0.9;
            else if (flowers.equals("Dahlias") && qntyFlowers>90)
            total=total*0.85;
        else if (flowers.equals("Tulips") && qntyFlowers>80)
            total=total*0.85;
        else if (flowers.equals("Narcissus") && qntyFlowers<120)
            total=total*1.15;
        else if (flowers.equals("Gladiolus") && qntyFlowers<80)
            total=total*1.2;

        if (total <= budget)
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",qntyFlowers,flowers,budget-total);
        else
            System.out.printf("Not enough money, you need %.2f leva more.",total-budget);
    }
}
