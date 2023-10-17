package RegularExpressionsMore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PostOffice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split("\\|");

        String regex1 = "([#$%&]+)([A-Z]+)\\1";
        Pattern patternCapital = Pattern.compile(regex1);
        Matcher matcher = patternCapital.matcher(text[0]);
        String capitalLetters = "";
        while (matcher.find()) {
            capitalLetters = matcher.group().replaceAll("[#|$|%|*|&]", "");
        }

        List<Integer> ascii = new ArrayList<>();
        List<Integer> len = new ArrayList<>();
        String regex2 = "\\d{2}:\\d{2}";
        Pattern patternLen = Pattern.compile(regex2);
        Matcher matcherLen = patternLen.matcher(text[1]);
        while (matcherLen.find()) {
            String[] result = matcherLen.group().split(":");
            int asciiCode = Integer.parseInt(result[0]);
            for (char symbol : capitalLetters.toCharArray()) {
                if ((int) symbol == asciiCode) {
                    ascii.add(asciiCode);
                    len.add(Integer.parseInt(result[1]) + 1);
                    capitalLetters = capitalLetters.replace("" + symbol, "0");
                }
            }
        }

        String[] words = text[2].split("\\s+");

        for (String word : words) {
            for (int i = 0; i < ascii.size(); i++) {
                if (word.charAt(0) == ascii.get(i)) {
                    if (word.length() == len.get(i)) {
                        System.out.println(word);
                    }
                }
            }
        }
    }
}
