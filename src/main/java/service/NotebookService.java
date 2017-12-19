package service;

import DAO.NotebookDAOImpl;
import model.Notebook;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class NotebookService {

    private NotebookDAOImpl notebookDAO = new NotebookDAOImpl();

    void add(Notebook notebook) throws SQLException{
        notebookDAO.add(notebook);
    }

    List<Notebook> getAll() throws SQLException{
        return notebookDAO.getAll();
    }

    Notebook getById(int id) throws SQLException{
        return notebookDAO.getById(id);
    }

    void update(Notebook notebook) throws SQLException{
        notebookDAO.update(notebook);
    }

    void remove(Notebook notebook) throws SQLException{
        notebookDAO.remove(notebook);
    }
}
