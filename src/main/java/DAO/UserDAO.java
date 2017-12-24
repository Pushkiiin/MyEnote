package DAO;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    void add(User user);

    List<User> getAll();

    User getById(int id);

    void remove(User user);
}
