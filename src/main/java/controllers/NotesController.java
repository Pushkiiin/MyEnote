package controllers;

import model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.NoteService;

import java.sql.SQLException;
import java.util.List;

@Controller
public class NotesController {

    private NoteService noteService;

    @Autowired
    public void setNoteService(NoteService noteService) {
        this.noteService = noteService;
    }

    @RequestMapping("/notes")
    public String showHome(Model model) throws SQLException {

        List<Note> notes = noteService.getAll();

        model.addAttribute("notes", notes);

        return "home";
    }

    @RequestMapping("/createnote")
    public String createNote() throws SQLException {

        return "createnote";
    }

    @RequestMapping(value = "/docreate", method = RequestMethod.POST)
    public String docreate(Model model, Note note) throws SQLException {

        noteService.add(note);
        return "notecreated";
    }
}
