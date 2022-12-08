package services.io_text_file.write_file;

import models.facilitys.inheritance.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFileVilla {
    public static void writeFile(String path, Map<Villa, Integer> map) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Map.Entry<Villa, Integer> entry : map.entrySet()) {
            String line = entry.getKey().formatCSVVilla() + "," + entry.getValue();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
