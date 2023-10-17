package RegularExressionsExersice;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String msg = scanner.nextLine();
            int count = 0;
            for (char symbol : msg.toLowerCase().toCharArray()) {
                if (symbol == 's' || symbol == 't' || symbol == 'a' || symbol == 'r')
                    count++;
            }
            StringBuilder result = new StringBuilder();
            for (char symbol : msg.toCharArray()) {
                int index = (int) symbol - count;
                ;
                char ch = (char) index;
                result.append(ch);
            }
            if (isValid(result.toString())) {
                Pattern patternPlanet = Pattern.compile("@(?<name>[A-Za-z]+)");
                Matcher matcher = patternPlanet.matcher(result.toString());
                String name = "";
                if (matcher.find())
                    name = matcher.group("name");
                Pattern pattern = Pattern.compile("\\!(?<one>[A-Z])\\!");
                Matcher matcher1 = pattern.matcher(result.toString());
                String action = "";
                if (matcher1.find())
                    action = matcher1.group("one");
                if (action.equals("A"))
                    attacked.add(name);
                else if (action.equals("D"))
                    destroyed.add(name);
            }
        }
        Collections.sort(destroyed);
        Collections.sort(attacked);
        System.out.println("Attacked planets: " + attacked.size());
        attacked.forEach(e -> System.out.println("-> " + e));
        System.out.println("Destroyed planets: " + destroyed.size());
        destroyed.forEach(e -> System.out.println("-> " + e));
    }
    public static boolean isValid(String msg){
        String regex = "(?<name>@[A-Za-z]+)([^@\\-!:>]*)(?<popul>\\:\\d+)([^@\\-!:>]*)(?<type>\\![AD]\\!)([^@\\-!:>]*)(?<soldiers>->\\d+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(msg);
        return matcher.find();
    }
}
