package DAO;

import model.User;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import utils.SessionUtil;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.sql.SQLException;
import java.util.List;

@Repository("userDao")
public class UserDAOImpl implements  UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    public void add(User user) {
        entityManager.persist(user);
    }

    public List<User> getAll() {
        TypedQuery<User> query = entityManager.createQuery("SELECT * FROM " + User.class.getName(), User.class);
        return query.getResultList();
    }

    public User getById(int id) {
        return entityManager.find(User.class, id);
    }

    public void remove(User user) {
        entityManager.remove(user);
    }
}
