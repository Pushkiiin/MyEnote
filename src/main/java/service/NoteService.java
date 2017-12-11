package service;

import DAO.NoteDAOImpl;
import model.Note;

import java.sql.SQLException;
import java.util.List;

public class NoteService {
    private NoteDAOImpl noteDAO = new NoteDAOImpl();

    void add(Note note) throws SQLException{
        noteDAO.add(note);
    }

    List<Note> getAll() throws SQLException{
        return noteDAO.getAll();
    }

    Note getById(int id) throws SQLException{
        return noteDAO.getById(id);
    }

    void update(Note note) throws SQLException{
        noteDAO.update(note);
    }

    void remove(Note note) throws SQLException{
        noteDAO.remove(note);
    }
}
