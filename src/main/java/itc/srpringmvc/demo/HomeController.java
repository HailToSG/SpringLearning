package itc.srpringmvc.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/"})
public class HomeController {

    @RequestMapping
    public String showStartPage(){
        return "main-menu";
    }
}
