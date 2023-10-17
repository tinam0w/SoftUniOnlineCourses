package JavaAdvanced.StreamsExercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class lineNumbers {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\35987\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        List<String> lines = Files.readAllLines(Path.of(path));

        PrintWriter printWriter = new PrintWriter("05_output.txt");
        int lineNumber = 1;
        for (String line : lines) {
            printWriter.println(lineNumber + ". " + line);
            lineNumber++;
        }
        printWriter.close();
    }
}
