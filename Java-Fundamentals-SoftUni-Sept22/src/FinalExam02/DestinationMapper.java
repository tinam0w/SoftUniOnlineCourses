package FinalExam02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> destinations = new ArrayList<>();
        String text = scanner.nextLine();
        String regex = "([=/])([A-Z][A-Za-z]{2,})\\1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int sum = 0;
        while (matcher.find()){
            String dest = matcher.group();
            dest = dest.replace("=", "");
            dest = dest.replace("/", "");
            destinations.add(dest);
            sum += dest.length();
        }
        System.out.println("Destinations: " + String.join(", ", destinations));
        System.out.println("Travel Points: " + sum);
    }
}
