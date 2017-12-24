package service;

import DAO.NoteDAOImpl;
import model.Note;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class NoteService {
    private NoteDAOImpl noteDAO = new NoteDAOImpl();

    public void add(Note note) throws SQLException{
        noteDAO.add(note);
    }

    public List<Note> getAll() throws SQLException{
        return noteDAO.getAll();
    }

    public Note getById(long id) throws SQLException{
        return noteDAO.getById(id);
    }

    public void update(Note note) throws SQLException{
        noteDAO.update(note);
    }

    public void remove(Note note) throws SQLException{
        noteDAO.remove(note);
    }
}
