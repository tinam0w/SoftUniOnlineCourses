package MidExamExercise;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double foodQnty = Double.parseDouble(scanner.nextLine());
        foodQnty = foodQnty * 1000;
        double hayQnty = Double.parseDouble(scanner.nextLine());
        hayQnty = hayQnty * 1000;
        double coverQnty = Double.parseDouble(scanner.nextLine());
        coverQnty = coverQnty * 1000;
        double weight = Double.parseDouble(scanner.nextLine());
        weight = weight * 1000;


        double eatenFood = 0;
        double eatenHay = 0;
        double eatenCover = 0;
        boolean noMoreFood = false;
        boolean noMoreHay = false;
        boolean noMoreCover = false;
        for (int i = 1; i <= 30; i++) {
            eatenFood += 300;
            if (eatenFood >= foodQnty) {
                noMoreFood = true;
                break;
            }

            if (i % 2 == 0) {
                eatenHay += (foodQnty - eatenFood) * 0.05;
            }
            if (eatenHay >= hayQnty){
                noMoreHay = true;
                break;
            }

            if (i % 3 == 0) {
                eatenCover += weight / 3;
            }
            if (eatenCover >= coverQnty){
                noMoreCover = true;
                break;
            }

        }
        if (!noMoreFood && !noMoreHay && !noMoreCover){
            System.out.printf("Everything is fine! Puppy is happy! " +
                    "Food: %.2f, " +
                    "Hay: %.2f, " +
                    "Cover: %.2f.",
                    (foodQnty - eatenFood)/1000,
                    (hayQnty - eatenHay)/1000,
                    (coverQnty - eatenCover)/1000);
        } else {
            System.out.printf("Merry must go to the pet store!");
        }
    }
}
