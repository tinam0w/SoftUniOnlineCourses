package JavaAdvanced.Streams;

import java.io.*;

public class copyBytes {
    public static void main(String[] args) {

        String basePath = "C:\\Users\\35987\\Desktop\\New folder";
        String inputPath = basePath + "\\input.txt";
        String outputPath = basePath + "\\03_output.txt";

        try (InputStream in = new FileInputStream(inputPath);
             OutputStream out = new FileOutputStream(outputPath)) {
            int readbyte = in.read();
            while (readbyte >= 0){
                if (readbyte == ' ' || readbyte == '\n'){
                    out.write(readbyte);
                } else {
                    String number = String.valueOf(readbyte); //"79"
                    for (int i = 0; i < number.length(); i++) {
                        out.write(number.charAt(i));
                    }
                }
                readbyte = in.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
