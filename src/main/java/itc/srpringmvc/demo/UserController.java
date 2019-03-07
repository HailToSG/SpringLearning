package itc.srpringmvc.demo;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    @InitBinder
    public void initBinder(WebDataBinder dataBinder){
        StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, trimmerEditor);
    }

    @RequestMapping("/showForm")
    private String showForm (Model theModel){
        User theUser = new User();
        theModel.addAttribute("user", theUser);
        return "user-form";
    }
    @RequestMapping("/processForm")
    private String processForm(@Valid @ModelAttribute("user") User theUser, BindingResult theResult){
        if (theResult.hasErrors())
            return "user-form";
        else
            return "info-page";
    }
}
