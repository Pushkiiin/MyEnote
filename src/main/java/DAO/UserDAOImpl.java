package DAO;

import model.User;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import utils.SessionUtil;

import java.sql.SQLException;
import java.util.List;

public class UserDAOImpl implements  UserDAO {

    private SessionUtil sessionUtil = new SessionUtil();

    public void add(User user) throws SQLException {

        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        session.save(user);

        sessionUtil.closeTransactionSession();
    }

    public List<User> getAll() throws SQLException {
        sessionUtil.openTransactionSession();
        String sql = "SELECT * FROM user";

        Session session = sessionUtil.getSession();
        Query query = session.createNativeQuery(sql).addEntity(User.class);
        List<User> userList = query.list();

        sessionUtil.closeTransactionSession();

        return userList;
    }

    public User getById(int id) throws SQLException {
        sessionUtil.openTransactionSession();
        String sql = "SELECT * FROM user WHERE id = " + id;

        Session session = sessionUtil.getSession();
        Query query = session.createNativeQuery(sql).addEntity(User.class);
        query.setParameter("id", id);

        User user = (User) query.getSingleResult();

        sessionUtil.closeTransactionSession();

        return user;
    }

    public void update(User user) throws SQLException {
        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        session.update(user);

        sessionUtil.closeTransactionSession();
    }

    public void remove(User user) throws SQLException {

        sessionUtil.openTransactionSession();

        Session session = sessionUtil.getSession();
        session.remove(user);

        sessionUtil.closeTransactionSession();

    }
}
