package services.io_text_file.read_file;

import models.facilitys.Facility;
import models.facilitys.inheritance.Villa;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileVilla{
    public static Map<Villa, Integer> readFile(String path) throws IOException {
        Map<Villa,Integer> map = new LinkedHashMap<>();
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] splitLine = line.split(",");
            Villa villa = new Villa(splitLine);
            map.put(villa,Integer.parseInt(splitLine[9]));
        }

        bufferedReader.close();
        return map;
    }
}
