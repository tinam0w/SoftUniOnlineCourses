package TextProcessingLab;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] input = inputLine.split("\\s+");
        int n = inputLine.length();
        String result = "";
        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j <= input[i].length(); j++) {
                System.out.print(input[i]);
            }
        }
        System.out.println();
    }
}
