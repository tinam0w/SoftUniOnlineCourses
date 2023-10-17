package JavaAdvanced.SersAndMapsExercise;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class uniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set = new LinkedHashSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            set.add(input);
        }
        if (!set.isEmpty())
            set.stream().forEach(e  -> System.out.println(e));
    }
}
