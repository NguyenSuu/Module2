package caculator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerCaculator {

    @GetMapping("/caculator")
    public ModelAndView caculator(@RequestParam String first,@RequestParam String second,@RequestParam String caculator){
        ModelAndView modelAndView=new ModelAndView("form");
        int number1=Integer.parseInt(first);
        int number2=Integer.parseInt(second);
        int result=0;
        switch (caculator){
            case "Addition(+)":
                result=number1+number2;
                break;
            case "Subtraction(-)":
                result=number1-number2;
                break;
            case "Multiplication(*)":
                result=number1*number2;
                break;
            default:
                result=number1/number2;
        }
        modelAndView.addObject("result",result);
        return modelAndView;
    }
    @GetMapping("form")
    public ModelAndView form(){
        ModelAndView modelAndView=new ModelAndView("form");
        return modelAndView;
    }
}
