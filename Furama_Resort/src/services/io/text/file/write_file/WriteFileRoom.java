package services.io.text.file.write_file;

import models.facilitys.inheritance.Room;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFileRoom{
    public static void writeFile(String path, Map<Room, Integer> map) throws IOException {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (Map.Entry<Room,Integer> entry:map.entrySet()) {
            bufferedWriter.write(entry.getKey().formatCSV() + entry.getKey());
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
