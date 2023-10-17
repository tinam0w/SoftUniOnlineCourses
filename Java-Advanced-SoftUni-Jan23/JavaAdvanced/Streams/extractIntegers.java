package JavaAdvanced.Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class extractIntegers {
    public static void main(String[] args) throws FileNotFoundException {

        String basePath = "C:\\Users\\35987\\Desktop\\New folder";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\04_output.txt";

        Scanner reader = new Scanner(new FileInputStream(inputPath));
        PrintStream writer = new PrintStream(new FileOutputStream(outputPath));

        //String line = reader.nextLine();
        //System.out.println(line);

        while (reader.hasNext()) {
            if (reader.hasNextInt()){
                writer.println(reader.nextInt());
            }
            reader.next();
        }
    }
}
