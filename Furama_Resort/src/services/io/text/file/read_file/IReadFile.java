package services.io.text.file.read_file;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface IReadFile<O> {
    List<O> readFile(String path) throws IOException;

}
