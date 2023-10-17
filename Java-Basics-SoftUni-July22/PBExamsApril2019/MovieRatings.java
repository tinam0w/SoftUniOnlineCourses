package PBExamsApril2019;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double maxRating = Double.MIN_VALUE;
        double minRating = Double.MAX_VALUE;
        String nameMax = "";
        String nameMin = "";
        double sum = 0;
        int i = 1;

        for (i = 1; i <= n ; i++) {
            String name = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());
            sum = sum + rating;
            if (rating > maxRating) {
                maxRating = rating;
                nameMax = name;
            }
            if (rating < minRating) {
                minRating = rating;
                nameMin = name;
            }
        }
        System.out.printf("%s is with highest rating: %.1f%n",nameMax,maxRating);
        System.out.printf("%s is with lowest rating: %.1f%n",nameMin,minRating);
        System.out.printf("Average rating: %.1f", sum/n);

    }
}
