package DAO;

import model.Note;

import java.sql.SQLException;
import java.util.List;

public interface NoteDAO {

    void add(Note note);

    List<Note> getAll();

    Note getById(long id);

    void remove(Note note);
}
