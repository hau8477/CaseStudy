package services.io.text.file.write_file;

import java.io.IOException;
import java.util.List;

public interface IWriteFile<O> {
    void write(String path,List<O> list) throws IOException;
}
