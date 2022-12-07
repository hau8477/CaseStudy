package services.io.text.file.read_file;

import models.facilitys.Facility;

import java.io.IOException;
import java.util.Map;

public interface IReadFileFacility {
    Map<Facility,Integer> readFile(String path) throws IOException;
}
