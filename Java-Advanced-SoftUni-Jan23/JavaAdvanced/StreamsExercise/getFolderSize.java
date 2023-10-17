package JavaAdvanced.StreamsExercise;

import java.io.File;
import java.util.Scanner;

public class getFolderSize {
    public static void main(String[] args) {

        String path = "C:\\Users\\35987\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File folder = new File(path);

        File[] allFolders = folder.listFiles();

        int folderSize = 0;
        for (File file : allFolders) {
            folderSize += file.length();
        }

        System.out.println("Folder size: " + folderSize);
    }
}
