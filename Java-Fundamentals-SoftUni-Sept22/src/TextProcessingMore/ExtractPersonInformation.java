package TextProcessingMore;

import java.util.Scanner;

public class ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n ; i++) {
            String input = scanner.nextLine();
            int index1 = 0;
            int index2 = 0;
            int index3 = 0;
            int index4 = 0;
            for (int j = 0; j < input.toCharArray().length; j++) {
                    index1 = (int) input.indexOf('@') + 1;
                    index2 = (int) input.indexOf('|');
                    index3 = (int) input.indexOf('#') + 1;
                    index4 = (int) input.indexOf('*');
            }
            String name = input.substring(index1, index2);
            String age = input.substring(index3, index4);
            System.out.println(name + " is " + age + " years old.");
        }
    }
}
