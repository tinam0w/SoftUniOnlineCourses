package JavaAdvanced.Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class readFile {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String filePath = "C:\\Users\\35987\\Desktop\\New folder\\input.txt";
        //на мак са другите черти, затова ще имаме проблем в зависимост на коя машина се подкарва програмат ни

        //try(InputStream inputStream = new FileInputStream(filePath)){
        //    int firstByte = inputStream.read();
        //    System.out.println((char)firstByte);
        //} catch (){

        //}

        //InputStream inputStream = new FileInputStream(filePath);

        //int firstByte = inputStream.read();
        //System.out.println((char)firstByte);

        //inputStream.close();

        try (InputStream inputStream = new FileInputStream(filePath)){
            int readByte = inputStream.read();

            while (readByte >= 0){
                System.out.print(Integer.toBinaryString(readByte) + " ");

                readByte = inputStream.read();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
}