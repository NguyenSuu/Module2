package htmlcontroller.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    @GetMapping("/layout")
    private String layout(){
        return "creatingbasiclayouts";
    }
    @GetMapping("/shortstories")
    private String stories(){
        return "createpageforshortstories";
    }
    @GetMapping("/usefixed")
    private String fixed(){
        return "usefixed";
    }
    @GetMapping("/CV")
    private String CV(){
        return "CV";
    }
    @GetMapping("/")
    private String index(){
        return "index";
    }
}
