package RegularExressionsExersice;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "%(?<client>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>\\d+)\\|[^|$%.]*?(?<price>\\d+.?\\d*)\\$";
        Pattern pattern = Pattern.compile(regex);
        double incomes = 0;
        while (!input.equals("end of shift")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String customer = matcher.group("client");
                String product = matcher.group("product");
                int count = Integer.parseInt(matcher.group("quantity"));
                double price = Double.parseDouble(matcher.group("price"));
                System.out.printf("%s: %s - %.2f%n", customer, product, count * price);
                incomes += count * price;
            }
            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", incomes);
    }
}
