package ListMore;

import java.util.*;
import java.util.stream.Collectors;

public class DrumSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        List<Integer> initialDrums = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> brokenDrums = new ArrayList<>();
        brokenDrums.addAll(initialDrums);

        String input = scanner.nextLine();
        while (!input.equals("Hit it again, Gabsy!")) {
            int power = Integer.parseInt(input);
            for (int i = 0; i < brokenDrums.size(); i++) {
                int newPower = brokenDrums.get(i) - power;
                brokenDrums.set(i, newPower);
                if (newPower <= 0) {
                    int drumPrice = initialDrums.get(i) * 3;
                    if (budget - drumPrice >= 0) {
                        brokenDrums.set(i, initialDrums.get(i));
                        budget -= drumPrice;
                    } else {
                        initialDrums.remove(i);
                        brokenDrums.remove(i);
                        if (i < brokenDrums.size() - 1)
                            i--;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (int item : brokenDrums) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", budget);
    }
}
