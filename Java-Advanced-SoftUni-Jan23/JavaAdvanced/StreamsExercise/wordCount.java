package JavaAdvanced.StreamsExercise;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class wordCount {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\35987\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        List<String> allLines = Files.readAllLines(Path.of(path));

        Map<String, Integer> allWords = new LinkedHashMap<>();
        for (String line : allLines) {
            String[] words = line.split("\\s+");
            Arrays.stream(words).
                    forEach(word -> allWords.put(word, 0));
        }

        String path2 = "C:\\Users\\35987\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        List<String> allLines2 = Files.readAllLines(Path.of(path2));

        for (String line : allLines2) {
            line = line.replaceAll("[\\.\\,\\!\\?\\:]", "");
            String [] words = line.split("\\s+");
            for (String word : words) {
                if (allWords.containsKey(word))
                    allWords.put(word, allWords.get(word) + 1);
            }
        }

        //сортиране:
        String outputFile = "results.txt";
        PrintWriter writer = new PrintWriter(outputFile);
        allWords.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));
        writer.close();

        //.sorted() очаква ччисло в скобите си
        //ако е 0 - не разменя местата на записите
        //ако е 1 - разменя
        //ако е -1 - не разменя местата

        //.compareTo() - сравнява две ст-ти
        //връща цало число
        //ако е 0 - първото е равно на второто
        //ако е 1 - първото е по-голямо от второто
        //ако е -1 - ако второто е по-голямо от първото

    }
}
