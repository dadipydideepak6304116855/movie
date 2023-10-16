package com.wipro.SearchMovie.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.SearchMovie.Service.AdminService;
import com.wipro.SearchMovie.entity.Admin;

@Controller
@RequestMapping("/tech")
public class TechController {

    @Autowired
    AdminService adminService;

    @GetMapping("/login")
    public String getIndexPage(){
        return "techLogin";
    }

    @PostMapping("/loginUser")
    public String loginHr(@ModelAttribute("user") Admin admin, Model model,HttpSession session){
        // validate hr login
        admin.setType("tech");
        String login = adminService.loginUser(admin,"tech");
        System.out.println("admin " + admin);
        if(login.equals("success")){
            session.setAttribute("email",admin.getEmail());
            return "techWelcome";
        }
        model.addAttribute("msg",login);
        return "techLogin";
    }

    @GetMapping("/techWelcome")
    public String getWelcomePage(HttpSession session){
        return "techWelcome";
    }

    @GetMapping("/techLogout")
    public String logoutUser(HttpSession session){
        session.invalidate();
        return "techLogin";
    }
}
