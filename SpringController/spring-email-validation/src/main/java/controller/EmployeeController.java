package controller;

import controller.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class EmployeeController {

    @RequestMapping(value = "/showform",method = RequestMethod.GET)
    public ModelAndView showForm(){
        ModelAndView modelAndView=new ModelAndView("create");
        modelAndView.addObject("employee",new Employee());
        return modelAndView;
    }
    @RequestMapping(value = "/addEmployee",method = RequestMethod.POST)
    private String addEmployee(@ModelAttribute("employee")Employee employee, BindingResult result, ModelMap model){
        model.addAttribute("name",employee.getName());
        model.addAttribute("contactNumber",employee.getContactNumber());
        model.addAttribute("id",employee.getId());
        return "info";
    }
}
