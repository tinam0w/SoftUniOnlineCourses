package FinalExam01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(#|\\|)(?<food>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<cal>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalCal = 0;
        Map<String, List<String>> map = new LinkedHashMap<>();
        while (matcher.find()){
            String foodName = matcher.group("food");
            String date = matcher.group("date");
            int cals = Integer.parseInt(matcher.group("cal"));
            totalCal += cals;
            map.put(foodName, new ArrayList<>());
            map.get(foodName).add(date);
            map.get(foodName).add("" + cals);
        }
        int days = totalCal / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Best before: " + entry.getValue().get(0) + ", Nutrition: " + entry.getValue().get(1));
        }
    }
}
