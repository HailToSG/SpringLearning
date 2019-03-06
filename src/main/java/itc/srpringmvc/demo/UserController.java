package itc.srpringmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/showForm")
    private String showForm (Model theModel){
        User theUser = new User();
        theModel.addAttribute("user", theUser);
        return "user-form";
    }
    @RequestMapping("/processForm")
    private String processForm(@ModelAttribute("user") User theUser){
        return "info-page";
    }
}