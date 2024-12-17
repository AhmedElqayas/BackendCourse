package main.com.myApp.controller;

import main.com.myApp.model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/userForm")
    public String showUserForm(Model model) {
        model.addAttribute("userModel", new UserModel());
        return "userForm";
    }
    @RequestMapping("/processForm")
    public String processUserForm(@ModelAttribute("userModel") UserModel userModel, Model model) {
        String usernameUppercase = userModel.getUsername().toUpperCase();
        userModel.setUsername(usernameUppercase);

        model.addAttribute("userModelResult", userModel);
        return "processForm";
    }
}