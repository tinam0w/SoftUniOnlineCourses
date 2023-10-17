package RegularExpressionsMore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RageQuit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toUpperCase();
        List<String> codes = new ArrayList<>();
        Pattern pattern = Pattern.compile("[^0-9]+\\d+");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String toAdd = matcher.group();
            codes.add(toAdd);
        }

        StringBuilder result = new StringBuilder();
        Pattern pattern1 = Pattern.compile("\\d+");
        for (String code : codes) {
            Matcher matcher1 = pattern1.matcher(code);
            if (matcher1.find()) {
                int digit = Integer.parseInt(matcher1.group());
                if (digit > 0) {
                    String toAdd = code.replace("" + digit, "");
                    for (int i = 1; i <= digit; i++) {
                        result.append(toAdd);
                    }
                }
            }
        }

        int count = uniqueSymbolsCount(result.toString());
        System.out.println("Unique symbols used: " + count);
        System.out.println(result);
    }

    public static int uniqueSymbolsCount(String text) {
        List<Character> toReturn = new ArrayList<>();
        for (char symbol : text.toCharArray()) {
            if (!toReturn.contains(symbol)) {
                toReturn.add(symbol);
            }
        }
        return toReturn.size();
    }
}
