package services.io.text.file.read_file.impl;

import models.facilitys.Facility;
import models.facilitys.inheritance.Villa;
import services.io.text.file.read_file.IReadFileFacility;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReadFileVilla implements IReadFileFacility {
    @Override
    public Map<Facility, Integer> readFile(String path) throws IOException {
        Map<Facility,Integer> map = new LinkedHashMap<>();
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String line;
        while ((line = bufferedReader.readLine()) != null){
            String[] splitLine = line.split(",");
            Facility villa = new Villa(splitLine);
            map.put(villa,Integer.parseInt(splitLine[9]));
        }

        bufferedReader.close();
        return map;
    }
}
