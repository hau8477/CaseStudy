package services.io.text.file.read_file.impl;

import models.facilitys.Facility;
import models.facilitys.inheritance.Room;
import services.io.text.file.read_file.IReadFileFacility;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileRoom implements IReadFileFacility {
    @Override
    public Map<Facility, Integer> readFile(String path) throws IOException {
        Map<Facility, Integer> map = new LinkedHashMap<>();
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
