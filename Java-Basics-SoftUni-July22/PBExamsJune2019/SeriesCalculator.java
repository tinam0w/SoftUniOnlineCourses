package PBExamsJune2019;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tvShow = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double lasting = Double.parseDouble(scanner.nextLine());

        double totalTime = (seasons * episodes * (lasting * 1.2)) + (seasons * 10);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", tvShow, Math.floor(totalTime));
    }
}
