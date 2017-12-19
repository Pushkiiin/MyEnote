package service;

import DAO.UserDAOImpl;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserService {
    private UserDAOImpl userDAO;

    @Autowired
    public void setUserDAO(UserDAOImpl userDAO) {
        this.userDAO = userDAO;
    }

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
