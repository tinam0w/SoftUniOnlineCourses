package RegularExressionsExersice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> furnitures = new ArrayList<>();
        double totalSum = 0;
        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);
        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                furnitures.add(matcher.group("furniture"));
                double price = Double.parseDouble(matcher.group("price"));
                int qnty = Integer.parseInt(matcher.group("quantity"));
                totalSum += price * qnty;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furnitures.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
