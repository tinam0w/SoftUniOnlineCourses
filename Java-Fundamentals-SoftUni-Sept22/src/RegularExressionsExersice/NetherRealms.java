package RegularExressionsExersice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> demons = new ArrayList<>();
        if (input.contains(",")) {
            for (String name : input.split(",\\s+")) {
                demons.add(name);
            }
        } else
            demons.add(input);

        Map<String, List<Double>> result = new LinkedHashMap<>();
        for (String name : demons) {
            double sumHealth = 0;
            //Pattern healthPattern = Pattern.compile("[^\\d\\-*+/.]");
            Pattern healthPattern = Pattern.compile("[^\\d\\+\\-*\\/\\.\"\" \"\"]");
            Matcher healthMatcher = healthPattern.matcher(name);
            StringBuilder healthString = new StringBuilder();
            while (healthMatcher.find()) {
                healthString.append(healthMatcher.group());
            }
            if (!healthString.isEmpty()) {
                for (char symbol : healthString.toString().toCharArray()) {
                    sumHealth += (int) symbol;
                }
            }
            double damage = 0;
            //Pattern patternDamage = Pattern.compile("\\+?-?\\d\\.?\\d*");
            Pattern patternDamage = Pattern.compile("(?:\\+|-)?[0-9]+(?:\\.[0-9]+)?");
            Matcher matcherDamage = patternDamage.matcher(name);
            while (matcherDamage.find()) {
                String res = matcherDamage.group();
                damage += Double.parseDouble(res);
            }
            if (damage > 0) {
                Pattern patternFixDamage = Pattern.compile("[*\\/]");
                Matcher matcherFixDamage = patternFixDamage.matcher(name);
                while (matcherFixDamage.find()) {
                    if (matcherFixDamage.group().equals("*"))
                        damage = damage * 2;
                    else if (matcherFixDamage.group().equals("/"))
                        damage = damage / 2;
                }
            }
            result.put(name, new ArrayList<>());
            result.get(name).add(sumHealth);
            result.get(name).add(damage);
        }
        for (Map.Entry<String, List<Double>> entry : result.entrySet()) {
            System.out.printf("%s - %.0f health, %.2f damage%n", entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }
    }
}
