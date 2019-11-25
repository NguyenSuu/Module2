package currency_converter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Converter {

    @GetMapping("/convert")
    public String converter(@RequestParam int number,Model model){
        model.addAttribute("number",number*23000);
        return "convert";
    }
}
