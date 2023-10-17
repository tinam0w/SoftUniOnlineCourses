package RegularExpressionsMore;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SantaSecretHelper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int key = Integer.parseInt(scanner.nextLine());
        String msg = scanner.nextLine();
        StringBuilder names = new StringBuilder();
        while (!msg.equals("end")) {
            StringBuilder text = new StringBuilder();
            for (char symbol : msg.toCharArray()) {
                int newChar = (int) symbol - key;
                text.append("" + (char) newChar);
            }
            String regex = "(?<name>@[A-Z][A-Za-z]+)([^@\\-!:>]*)(?<beh>![G|N]!)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            if (matcher.find()){
                String behavior = matcher.group("beh");
                String name = matcher.group("name").replace("@", "");
                if (behavior.equals("!G!"))
                    System.out.println(name);
            }
            msg = scanner.nextLine();
        }
    }
}
