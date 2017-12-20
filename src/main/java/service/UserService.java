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

    public void add(User user) throws SQLException{
        userDAO.add(user);
    }

    public List<User> getAll() throws SQLException{
        return userDAO.getAll();
    }

    public User getById(int id) throws SQLException{
        return userDAO.getById(id);
    }

    public void update(User user) throws SQLException{
        userDAO.update(user);
    }

    public void remove(User user) throws SQLException{
        userDAO.remove(user);
    }
}
