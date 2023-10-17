package JavaAdvanced.StreamsExercise;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class sumLines {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\35987\\Desktop\\New folder\\C:\\Users\\35987\\Desktop\\New folder\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        List<String> allLines = Files.readAllLines(Path.of(path));

//        for (String line : allLines) {
//            int sum = 0;
//            for (char symbol : line.toCharArray()) {
//                sum += symbol;
//            }
//            System.out.println(sum);
//        }

        allLines.stream().
                map(line -> line.toCharArray())
                .forEach(arr -> {
                    int sum = 0;
                    for (char symbol : arr) {
                        sum += symbol;
                    }
                    System.out.println(sum);
                });

    }
}
