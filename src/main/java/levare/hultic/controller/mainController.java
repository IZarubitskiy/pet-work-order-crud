package levare.hultic.controller;

import levare.hultic.repository.BaseRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {

    public mainController(BaseRepository baseRepository) {
    }

    @GetMapping
    public String index(Model model) {
        model.addAttribute("text" , "Main Page");
        return "main";
    }

}
