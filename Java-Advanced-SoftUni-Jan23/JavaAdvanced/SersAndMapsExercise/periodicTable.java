package JavaAdvanced.SersAndMapsExercise;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class periodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new TreeSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            for (String e : input) {
                set.add(e);
            }
        }
        set.stream().forEach(e -> System.out.print(e + " "));
    }
}
