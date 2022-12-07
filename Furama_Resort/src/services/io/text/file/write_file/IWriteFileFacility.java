package services.io.text.file.write_file;

import models.facilitys.Facility;

import java.util.Map;

public interface IWriteFileFacility {
    void writeFile(String path, Map<Facility,Integer> map);
}
