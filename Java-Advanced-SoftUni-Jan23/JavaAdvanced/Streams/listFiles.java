package JavaAdvanced.Streams;

import java.io.File;
import java.util.Scanner;

public class listFiles {
    public static void main(String[] args) {

        String folderPath = "C:\\Users\\35987\\Desktop\\New folder\\Files-and-Streams";
        File file = new File(folderPath);

        File[] nestedFiles = file.listFiles();
        for (File nestedFile: nestedFiles) {
            if(nestedFile.isFile()){
                System.out.printf("%s: [%d]%n", nestedFile.getName(), nestedFile.length());
            }
        }
    }
}
