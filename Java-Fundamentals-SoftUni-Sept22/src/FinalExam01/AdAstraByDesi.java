package FinalExam01;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstraByDesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "(#|\\|)(?<food>[A-Za-z\\s]+)\\1(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<cal>[0-9]+)\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int totalCal = 0;
        StringBuilder allFood = new StringBuilder();
        while (matcher.find()){
            String foodName = matcher.group("food");
            String date = matcher.group("date");
            int cals = Integer.parseInt(matcher.group("cal"));
            totalCal += cals;
            allFood.append(String.format("Item: %s, Best before: %s, Nutrition: %d%n", foodName, date, cals));
        }
        int days = totalCal / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        System.out.println(allFood);
    }
}
