package main.com.myApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDate;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage() {
        return "homePage";
    }

    @RequestMapping("/processForm")
    public String showSuccessPage(HttpServletRequest request, Model model) {
        String birthYear = request.getParameter("birthYear");
        String birthMonth = request.getParameter("birthMonth");
        String birthDay = request.getParameter("birthDay");

        int yearsDifference = LocalDate.now().getYear() - Integer.parseInt(birthYear);
        int monthsDifference = LocalDate.now().getMonthValue() - Integer.parseInt(birthMonth);
        int daysDifference = LocalDate.now().getDayOfMonth() - Integer.parseInt(birthDay);

        model.addAttribute("years", yearsDifference);
        model.addAttribute("months", monthsDifference);
        model.addAttribute("days", daysDifference);

        return "resultPage";
    }
}
