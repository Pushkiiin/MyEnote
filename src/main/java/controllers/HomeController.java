package controllers;

import model.Note;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHome(Model model) throws SQLException {

        return "home";
    }
}
