package itc.srpringmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = {"/hello"})
public class GreetingsPageController {

    @RequestMapping({"/personal"})
    private String showInfo() {
        return "personal-page";
    }

    @RequestMapping({"/processForm1"})
    private String processForm(HttpServletRequest request, Model model) {
        String userName = request.getParameter("userName");
        String result = "Hello, " + userName.toUpperCase();

        model.addAttribute("greeting", result);
        return "greetings-page";
    }

    @RequestMapping({"/processForm2"})
    private String processWithAdditions(@RequestParam("userName") String userName, Model model) {
        String result = "Hello, " + userName.toUpperCase();

        model.addAttribute("greeting", result);
        return "greetings-page";
    }
}
