package JavaAdvanced.Streams;

import java.io.*;

public class writeEveryThirdLine {
    public static void main(String[] args) {


        String basePath = "C:\\Users\\35987\\Desktop\\New folder";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\05_output.txt";


        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath));
             PrintStream writer = new PrintStream(new FileOutputStream(outputPath))) {

            int count = 1;
            String  line = reader.readLine();
            while (line != null){  //null = -1 end of file
                if (count % 3 == 0){
                    writer.println(line);
                }
                line = reader.readLine();
                count++;
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
