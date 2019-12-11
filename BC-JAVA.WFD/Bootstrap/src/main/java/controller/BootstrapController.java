package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BootstrapController {
    @GetMapping("/gallery")
    public ModelAndView gallery(){
        ModelAndView modelAndView=new ModelAndView("gallery");
        return modelAndView;
    }
}
