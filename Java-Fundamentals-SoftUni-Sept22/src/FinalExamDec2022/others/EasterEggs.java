package FinalExamDec2022.others;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EasterEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String regex = "[@#]+(?<color>[a-z]{3,})[@#]+\\W*\\/+(?<sum>[0-9]+)\\/+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            String color = matcher.group("color");
            int amount = Integer.parseInt(matcher.group("sum"));
            System.out.println("You found " + amount + " " + color + " eggs!");
        }
    }
}
