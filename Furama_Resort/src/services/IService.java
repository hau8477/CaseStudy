package services;

import java.io.IOException;
import java.util.List;

public interface IService<O> {
    void addNew(O object) throws IOException;

    List<O> getList() throws IOException;
}
