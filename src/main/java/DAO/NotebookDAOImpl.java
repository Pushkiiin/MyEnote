package DAO;

import model.Note;
import model.Notebook;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import utils.SessionUtil;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.sql.SQLException;
import java.util.List;

@Repository("noteBookDao")
public class NotebookDAOImpl implements NotebookDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void add(Notebook notebook) {
        entityManager.persist(notebook);
    }

    public List<Notebook> getAll() throws SQLException {
        TypedQuery<Notebook> query = entityManager.createQuery("SELECT * FROM " + Notebook.class.getName(), Notebook.class);
        return query.getResultList();
    }

    public Notebook getById(int id) {
        return entityManager.find(Notebook.class, id);
    }

    public void remove(Notebook notebook) {
        entityManager.remove(notebook);
    }
}
