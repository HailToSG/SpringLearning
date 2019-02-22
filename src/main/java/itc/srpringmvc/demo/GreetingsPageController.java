package itc.srpringmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingsPageController {

    @RequestMapping({"/user"})
    private String showInfo(){
        return "user-page";
    }

    @RequestMapping({"/processForm"})
    private String processForm(){
        return "greetings-page";
    }
}
