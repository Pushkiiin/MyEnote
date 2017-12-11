package DAO;

import model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDAO {

    void add(User user) throws SQLException;

    List<User> getAll() throws SQLException;

    User getById(int id) throws SQLException;

    void update(User user) throws SQLException;

    void remove(User user) throws SQLException;
}
