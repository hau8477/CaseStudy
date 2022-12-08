package services.io_text_file.read_file;

import models.facilitys.Facility;
import models.facilitys.inheritance.Room;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileRoom{
    public static Map<Room, Integer> readFile(String path) throws IOException {
        Map<Room, Integer> map = new LinkedHashMap<>();
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] splitLine = line.split(",");
            Room room = new Room(splitLine);
            map.put(room,Integer.parseInt(splitLine[7]));
        }

        bufferedReader.close();
        return map;
    }
}
