package RegularExressionsExersice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> demons = new ArrayList<>();

        String[] names = scanner.nextLine().split("[, ]+");

        for (String name : names) {
            int health = 0;
            String regex = "[^\\d+\\+\\-*\\/\\.]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(name);
            StringBuilder wordHealth = new StringBuilder();
            while (matcher.find()) {
                wordHealth.append(matcher.group());
            }
            for (char symbol : wordHealth.toString().toCharArray()) {
                health += (int) symbol;
            }
            double damage = 0;
            String regex1 = "\\-?[0-9]+\\.?[0-9]*";
            Pattern pattern1 = Pattern.compile(regex1);
            Matcher matcher1 = pattern1.matcher(name);
            while (matcher1.find()) {
                double digit = Double.parseDouble(matcher1.group());
                damage += digit;
            }
            for (char symbol : name.toCharArray()) {
                if (symbol == '*')
                    damage *= 2;
                else if (symbol == '/')
                    damage /= 2;
            }
            String toAdd = name + " - " + health + " health, " + String.format("%.2f", damage) + " damage";
            demons.add(toAdd);
        }
        for (String demon : demons) {
            System.out.println(demon);
        }
    }
}
