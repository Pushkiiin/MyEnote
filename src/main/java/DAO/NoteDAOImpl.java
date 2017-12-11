package DAO;

import model.Note;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.SessionUtil;

import java.sql.SQLException;
import java.util.List;

public class NoteDAOImpl implements  NoteDAO {

    private SessionUtil sessionUtil = new SessionUtil();

    public void add(Note note) throws SQLException {
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        session.save(note);

        sessionUtil.closeTransactionSession();
    }

    public List<Note> getAll() throws SQLException {
        sessionUtil.openTransactionSession();
        String sql = "SELECT * FROM note";

        Session session = sessionUtil.getSession();
        Query query = session.createNativeQuery(sql).addEntity(Note.class);
        List<Note> noteList = query.list();

        sessionUtil.closeTransactionSession();

        return noteList;
    }

    public Note getById(int id) throws SQLException {
        sessionUtil.openTransactionSession();
        String sql = "SELECT * FROM note WHERE id = " + id;

        Session session = sessionUtil.getSession();
        Query query = session.createNativeQuery(sql).addEntity(Note.class);
        query.setParameter("id", id);

        Note note = (Note) query.getSingleResult();

        sessionUtil.closeTransactionSession();

        return note;
    }

    public void update(Note note) throws SQLException {
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        session.update(note);

        sessionUtil.closeTransactionSession();
    }

    public void remove(Note note) throws SQLException {
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        session.remove(note);

        sessionUtil.closeTransactionSession();
    }
}
