package FinalExam05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        text = text.replace(",", "");
        text = text.replace(".", "");
        String[] input = text.split("\\s+");
        List<String> coolEmojisList = new ArrayList<>();
        int collThreshold = countCoolness(text);
        int coolEmojis = 0;
        int allEmojis = 0;
        for (String word : input) {
            if ((word.startsWith("::") && word.endsWith("::")) ||
                    (word.startsWith("**") && word.endsWith("**"))) {
                String emoji = word.substring(2, word.length() - 2);
                if (emoji.length() >= 3) {
                    if (emoji.charAt(0) >= 'A' && emoji.charAt(0) <= 'Z') {
                        if (isOtherLower(emoji)) {
                            allEmojis++;
                            if (coolnessCount(emoji) >= collThreshold)
                                coolEmojisList.add(word);
                        }
                    }
                }
            }
        }
        System.out.println("Cool threshold: " + collThreshold);
        System.out.println(allEmojis + " emojis found in the text.");
        System.out.println("The cool ones are:");
        for (String item : coolEmojisList) {
            System.out.println(item);
        }
    }

    public static boolean isOtherLower(String text) {
        String otherText = text.substring(1);
        int count = 0;
        for (char letter : otherText.toCharArray()) {
            if (letter >= 'a' && letter <= 'z') {
                count++;
            }
        }
        return count == otherText.length();
    }
    public static int countCoolness(String text){
        int result = 1;
        for (char symbol : text.toCharArray()) {
            if (symbol >= '0' && symbol <= '9')
                result *= Integer.parseInt((char) symbol + "");
        }
        return result;
    }
    public static int coolnessCount(String emoji){
        int coolness = 0;
        for (char symbol : emoji.toCharArray()) {
            coolness += (int) symbol;
        }
        return coolness;
    }
}
