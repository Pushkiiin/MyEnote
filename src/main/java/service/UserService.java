package service;

import DAO.UserDAOImpl;
import model.User;

import java.sql.SQLException;
import java.util.List;

public class UserService {
    private UserDAOImpl userDAO = new UserDAOImpl();

    void add(User user) throws SQLException{
        userDAO.add(user);
    }

    List<User> getAll() throws SQLException{
        return userDAO.getAll();
    }

    User getById(int id) throws SQLException{
        return userDAO.getById(id);
    }

    void update(User user) throws SQLException{
        userDAO.update(user);
    }

    void remove(User user) throws SQLException{
        userDAO.remove(user);
    }
}
