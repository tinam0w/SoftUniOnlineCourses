package FinalExam05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        int threshold = 1;
        for (char symbol : text.toCharArray()) {
            if (Character.isDigit(symbol))
                threshold *= Integer.parseInt("" + symbol);
        }

        //my regex:  not working???
        //String regex = "([:*]{2})[A-Z][a-z]{2,}\\1";

        //not my regex:
        String regex = ":{2}([A-Z][a-z]{2,}):{2}|\\*{2}([A-Z][a-z]{2,})\\*{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> cools = new ArrayList<>();
        int count = 0;
        while (matcher.find()) {
            String emoji = matcher.group();
            count++;
            int sum = 0;
            for (char symbol : emoji.toCharArray()) {
                if (Character.isLetter(symbol)) {
                    sum += (int) symbol;
                }
            }
            if (sum >= threshold) {
                cools.add(emoji);
            }
        }
        System.out.println("Cool threshold: " + threshold);
        System.out.println(count + " emojis found in the text. The cool ones are:");
        for (String emoji : cools) {
            System.out.println(emoji);
        }
    }
}