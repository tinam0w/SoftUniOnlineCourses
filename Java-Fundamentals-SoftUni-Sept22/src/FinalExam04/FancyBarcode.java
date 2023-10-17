package FinalExam04;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            String regex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(barcode);
            String group = "";
            if (matcher.find()) {
                for (char symbol : barcode.toCharArray()) {
                    if (Character.isDigit(symbol)){
                        group += symbol;
                    }
                }
                if (group.length() == 0)
                    group = "00";
                System.out.println("Product group: " + group);
            }
            if (group.length() == 0)
                System.out.println("Invalid barcode");
        }
    }
}
