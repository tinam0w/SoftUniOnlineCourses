package TextProcessingExercise;

import java.io.File;
import java.util.Scanner;

public class ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] text = scanner.nextLine().split("\\\\");

        String filaName = text[text.length - 1];
        String file = filaName.split("\\.")[0];
        String extension = filaName.split("\\.")[1];
        System.out.println("File name: " + file);
        System.out.println("File extension: " + extension);
    }
}
