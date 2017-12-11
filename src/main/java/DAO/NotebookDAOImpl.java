package DAO;

import model.Notebook;
import org.hibernate.Session;
import org.hibernate.query.Query;
import utils.SessionUtil;

import java.sql.SQLException;
import java.util.List;

public class NotebookDAOImpl implements NotebookDAO {

    private SessionUtil sessionUtil = new SessionUtil();

    public void add(Notebook notebook) throws SQLException {
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        session.save(notebook);

        sessionUtil.closeTransactionSession();
    }

    public List<Notebook> getAll() throws SQLException {
        sessionUtil.openTransactionSession();
        String sql = "SELECT * FROM notebook";

        Session session = sessionUtil.getSession();
        Query query = session.createNativeQuery(sql).addEntity(Notebook.class);
        List<Notebook> notebookList = query.list();

        sessionUtil.closeTransactionSession();

        return notebookList;
    }

    public Notebook getById(int id) throws SQLException {
        sessionUtil.openTransactionSession();
        String sql = "SELECT * FROM notebook WHERE id = " + id;

        Session session = sessionUtil.getSession();
        Query query = session.createNativeQuery(sql).addEntity(Notebook.class);
        query.setParameter("id", id);

        Notebook notebook = (Notebook) query.getSingleResult();

        sessionUtil.closeTransactionSession();

        return notebook;
    }

    public void update(Notebook notebook) throws SQLException {
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        session.update(notebook);

        sessionUtil.closeTransactionSession();
    }

    public void remove(Notebook notebook) throws SQLException {
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        session.remove(notebook);

        sessionUtil.closeTransactionSession();
    }
}
