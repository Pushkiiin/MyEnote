import DAO.NoteDAOImpl;
import DAO.NotebookDAOImpl;
import DAO.UserDAOImpl;
import model.Note;
import model.Notebook;
import utils.HibernateUtil;
import model.User;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException {
//        Session session = HibernateUtil.getSessionFactory().openSession();
//
//        session.beginTransaction();
//
//        User user = new User();
//        user.setLogin("vova");
//        user.setPassword("123");
//
//        session.save(user);
//        session.getTransaction().commit();
//        HibernateUtil.shutdown();

        UserDAOImpl userDAO = new UserDAOImpl();
        NoteDAOImpl noteDAO = new NoteDAOImpl();
        NotebookDAOImpl notebookDAO = new NotebookDAOImpl();

        User user = new User();
        user.setPassword("qwe");
        user.setLogin("qwe");

        Note note = new Note();
        note.setContent("asd");

        Notebook notebook = new Notebook();
        notebook.setName("zxc");
        notebook.setNotes(new ArrayList<Note>());

        userDAO.add(user);
        noteDAO.add(note);
        notebookDAO.add(notebook);

        HibernateUtil.shutdown();
    }
}
