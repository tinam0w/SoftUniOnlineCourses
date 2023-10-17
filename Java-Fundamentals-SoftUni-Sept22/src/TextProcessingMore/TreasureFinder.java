package TextProcessingMore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TreasureFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] key = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String text = scanner.nextLine();
        List<String> results = new ArrayList<>();
        while (!text.equals("find")) {
            int index = 0;
            String text2 = "";
            for (int i = 0; i < text.length(); i++) {
                int newChar = (int) text.charAt(i) - key[index];
                text2 += (char) newChar;
                index++;
                if (index >= key.length)
                    index = 0;
            }
            results.add(text2);
            text = scanner.nextLine();
        }

        for (String result : results) {
            int index1 = result.indexOf('&', 0) + 1;
            int index2 = result.indexOf('&', index1 + 1);
            int index3 = result.indexOf('<') + 1;
            int index4 = result.indexOf('>');
            String item = result.substring(index1, index2);
            String where = result.substring(index3, index4);
            System.out.println("Found " + item + " at " + where);
        }
    }
}