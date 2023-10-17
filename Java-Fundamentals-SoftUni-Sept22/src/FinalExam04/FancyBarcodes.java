package FinalExam04;

import java.util.Scanner;

public class FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String barcode = scanner.nextLine();
            boolean isValid = false;
            if (checkForSurroundings(barcode)) {
                barcode = barcode.replace("@", "");
                barcode = barcode.replace("#", "");
                if (barcode.length() >= 6) {
                    if (barcode.charAt(0) >= 'A' && barcode.charAt(0) <= 'Z') {
                        if (checkForLettersAndDigits(barcode)) {
                            if (barcode.charAt(barcode.length() - 1) >= 'A' && barcode.charAt(barcode.length() - 1) <= 'Z') {
                                isValid = true;
                            }
                        }
                    }
                }
            }
            if (isValid)
                System.out.println("Product group: " + countGroup(barcode));
            else
                System.out.println("Invalid barcode");
        }
    }

    public static boolean checkForSurroundings(String barcode) {
        boolean isTailOk = false;
        if (barcode.startsWith("@")) {
            int index = barcode.lastIndexOf("@");
            if (index > 0) {
                String tail = barcode.substring(index + 1);
                int count = 0;
                for (char symbol : tail.toCharArray()) {
                    if (symbol == '#')
                        count++;
                }
                if (count == tail.length()) {
                    if (barcode.charAt(1) == '#')
                        isTailOk = true;
                }
            }
        }
        return isTailOk;
    }

    public static boolean checkForLettersAndDigits(String barcode) {
        int count = 0;
        for (char symbol : barcode.toCharArray()) {
            if (Character.isLetterOrDigit(symbol))
                count++;
        }
        return count == barcode.length();
    }
    public static String countGroup(String barcode){
        String result = "";
        for (char symbol : barcode.toCharArray()) {
            if (symbol >= '0' && symbol <= '9')
                result += ((char) symbol);
        }
        if (result.isEmpty()){
            result = "00";
        }
        return result.toString();
    }
}
