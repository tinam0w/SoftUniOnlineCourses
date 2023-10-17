package JavaAdvanced.StreamsExercise;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class sumBytes {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\35987\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        //String output = "C:\\Users\\35987\\Desktop\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\02_output.txt";

        //List<String> allLines = Files.readAllLines(Path.of(path));
//
//        long sum = 0; //suma ot vsichki asscii kodove
//        for (String line: allLines) {
//            for (char symbol: line.toCharArray()){
//                sum += symbol;
//            }
//        }
        long sum = 0;
        byte[] allBytes = Files.readAllBytes(Path.of(path));
        for (byte ascii : allBytes) {
            if (ascii != 10 && ascii != 13) //махаме \n и \r
                sum += ascii;
        }
        System.out.println(sum);

    }
}
