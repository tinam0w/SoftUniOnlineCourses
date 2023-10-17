package FinalExam01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int sumCalories = 0;
        Map<String, List<String>> foodMap = new LinkedHashMap<>();

        String regex3 = "(#|\\|)(?<food>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<cal>[0-9]+)\\1";
        Pattern pattern3 = Pattern.compile(regex3);
        Matcher matcher3 = pattern3.matcher(input);

        while (matcher3.find()) {
            String food = matcher3.group();
            String[] info = new String[food.length() - 4];
            if (food.contains("#"))
                info = food.split("#");
            else if (food.contains("|"))
                info = food.split("\\|");
            int calories = Integer.parseInt(info[3]);
            if (calories >= 0 && calories <= 10000) {
                sumCalories += calories;
                foodMap.putIfAbsent(info[1], new ArrayList<>());
                foodMap.get(info[1]).add(info[2]);
                foodMap.get(info[1]).add(info[3]);
            }
        }
        System.out.println("You have food to last you for: " + sumCalories / 2000 + " days!");
        for (Map.Entry<String, List<String>> entry : foodMap.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Best before: " + entry.getValue().get(0) + ", Nutrition: " + entry.getValue().get(1));
        }
    }
}
