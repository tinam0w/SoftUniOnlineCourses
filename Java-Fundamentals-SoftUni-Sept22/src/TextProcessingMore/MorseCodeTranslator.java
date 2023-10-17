package TextProcessingMore;

import java.util.Scanner;

public class MorseCodeTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length; i++) {
            String[] word = input[i].split("\\s+");
            for (int j = 0; j < word.length; j++) {
                result.append(findMorseLetter(word[j]));
            }
            result.append(" ");
        }
        System.out.println(result);
    }

    public static String findMorseLetter(String letter) {
        String result = "";
        switch (letter) {
            case ".-":
                result = "A";
                break;
            case "-...":
                result = "B";
                break;
            case "-.-.":
                result = "C";
                break;
            case "-..":
                result = "D";
                break;
            case ".":
                result = "E";
                break;
            case "..-.":
                result = "F";
                break;
            case "--.":
                result = "G";
                break;
            case "....":
                result = "H";
                break;
            case "..":
                result = "I";
                break;
            case ".---":
                result = "J";
                break;
            case "-.-":
                result = "K";
                break;
            case ".-..":
                result = "L";
                break;
            case "--":
                result = "M";
                break;
            case "-.":
                result = "N";
                break;
            case "---":
                result = "O";
                break;
            case ".--.":
                result = "P";
                break;
            case "--.-":
                result = "Q";
                break;
            case ".-.":
                result = "R";
                break;
            case "...":
                result = "S";
                break;
            case "-":
                result = "T";
                break;
            case "..-":
                result = "U";
                break;
            case "...-":
                result = "V";
                break;
            case ".--":
                result = "W";
                break;
            case "-..-":
                result = "X";
                break;
            case "-.--":
                result = "Y";
                break;
            case "--..":
                result = "Z";
                break;
        }
        return result;
    }
}