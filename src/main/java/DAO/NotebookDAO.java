package DAO;

import model.Notebook;

import java.sql.SQLException;
import java.util.List;

public interface NotebookDAO {

    void add(Notebook notebook);

    List<Notebook> getAll();

    Notebook getById(int id);

    void remove(Notebook notebook);
}
