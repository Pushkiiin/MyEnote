package controllers;

import model.Note;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.NoteService;

import java.sql.SQLException;
import java.util.List;

@Controller
public class NotesController {

    @Autowired
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
    public String createNote(Model model) throws SQLException {
        Note note = new Note();
        model.addAttribute(note);
        return "note";
    }

    @RequestMapping("/edit-note/{id}")
    public String editNote(@PathVariable("id") Integer id, Model model) throws SQLException {
        Note note = noteService.getById(id);
        model.addAttribute(note);
        return "note";
    }

    @RequestMapping(value = "/save-note", method = RequestMethod.POST)
    public String saveNote(@ModelAttribute("note") Note note) throws SQLException {
        noteService.add(note);
        return "redirect:/notes";
    }

    @RequestMapping("/remove-note/{id}")
    public String removeNote(@PathVariable("id") long id) throws SQLException {
        noteService.remove(noteService.getById(id));
        return "redirect:/notes";
    }
}
