package JavaAdvanced.StreamsExercise;

import java.io.*;

public class demo {
    public static void main(String[] args) throws IOException {

        // 1. за писане във файл - много удобен - използва се
        String path = "C:\\Users\\35987\\Desktop\\demo.txt";
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file); //или името на файла или пътя до крайния файл
        fileWriter.write("this is demo");
        fileWriter.close();

        // 2. доста по-бърз от 1 - използва се
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("demo for bufferedWriter");
        bufferedWriter.close();

        // 3. универсален за писане във нов файл и в аутпут стрийм
        //PrintWriter printWriter = new PrintWriter();

    }
}
