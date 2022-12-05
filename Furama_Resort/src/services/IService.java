package services;

import java.util.List;

public interface IService<O> {
    void addNew(O object);

    List<O> getList();

    void returnMainMenu();
}
