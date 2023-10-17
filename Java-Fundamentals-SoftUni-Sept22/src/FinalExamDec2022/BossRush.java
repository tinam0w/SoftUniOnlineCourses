package FinalExamDec2022;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BossRush {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String regex = "(?<name>\\|[A-Z]{4,}\\|):(?<title>#[A-Za-z]+ [A-Za-z]+#)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String name = matcher.group("name").replace("|", "");
                String title = matcher.group("title").replace("#", "");
                System.out.println(name + ", The " + title);
                System.out.println(">> Strength: " + name.length());
                System.out.println(">> Armor: " + title.length());
            } else
                System.out.println("Access denied!");
        }
    }
}
