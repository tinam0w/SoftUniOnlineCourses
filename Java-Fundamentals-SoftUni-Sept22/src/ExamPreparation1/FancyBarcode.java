package ExamPreparation1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pattern pattern = Pattern.compile("@#+[A-z][A-Za-z0-9]{4,}[A-Z]@#+");
        Matcher matcher = null;
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            matcher = pattern.matcher(barcode);
            if (matcher.find()) {
                StringBuilder result = new StringBuilder();
                for (char symbol : barcode.toCharArray()) {
                    if (Character.isDigit(symbol)) {
                        result.append(symbol);
                    }
                }
                if (result.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + result.toString());
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}
