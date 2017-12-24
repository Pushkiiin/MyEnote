package DAO;

import model.Note;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.sql.SQLException;
import java.util.List;

@Repository("noteDao")
public class NoteDAOImpl implements  NoteDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void add(Note note) {
        entityManager.persist(note);
    }

    public List<Note> getAll() {
        TypedQuery<Note> query = entityManager.createQuery("SELECT * FROM " + Note.class.getName(), Note.class);
        return query.getResultList();
    }

    public Note getById(long id) {
        return entityManager.find(Note.class, id);
    }

    public void remove(Note note) {
        entityManager.remove(note.getId());
    }
}
