package PBExamsJune2019;

import java.util.Scanner;

public class FavMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int points = 0;
        int maxPoints = 0;
        String maxName = "";
        int count = 0;

        String movie = scanner.nextLine();
        while (!movie.equals("STOP")){
            count++;
            for (int i = 0; i <= movie.length()-1 ; i++) {
                char letter = movie.charAt(i);
                points = points + letter;
                if (letter >= 65 && letter <= 90)
                    points = points - (movie.length());
                if (letter >= 97 && letter <= 122)
                    points = points - (2 * movie.length());
            }
            if (points > maxPoints){
                maxPoints = points;
                maxName = movie;
            }
            points = 0;
            if (count == 7){
                System.out.println("The limit is reached.");
                break;
            }
            else
                movie = scanner.nextLine();
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", maxName,maxPoints);
    }
}
