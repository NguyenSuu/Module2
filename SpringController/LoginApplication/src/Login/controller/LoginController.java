package Login.controller;

import Login.dao.UserDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import Login.model.Login;
import Login.model.User;

import javax.swing.*;
import java.awt.*;

@Controller
public class LoginController {

    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView modelAndView=new ModelAndView("home","login",new Login());
        return modelAndView;
    }
    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = UserDao.checkLogin(login);
        if(user == null){
            ModelAndView modelAndView = new ModelAndView("home");
            modelAndView.addObject("message","User or password is wrong!");
//            Component panel = null;
//            JOptionPane.showMessageDialog(panel, "User or password is wrong!", "Warning",
//                    JOptionPane.WARNING_MESSAGE);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }
}
