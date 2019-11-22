package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Test {
    @GetMapping("/test")
    public String test(@RequestParam String txt, Model model){
    model.addAttribute("txt",txt);
        return "test";
    }
    @GetMapping("/test2")
    public String test2(){
        return "test2";
    }
}
