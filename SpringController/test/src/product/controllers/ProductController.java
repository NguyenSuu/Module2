package product.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import product.model.Product;
import product.service.ProductService;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    public ProductService productService;

    @GetMapping("/view")
    public ModelAndView list(){
        List<Product> products=this.productService.findAll();
        ModelAndView modelAndView=new ModelAndView("list");
        modelAndView.addObject("products",products);
        return modelAndView;
    }
    @GetMapping("/createForm")
    public ModelAndView createForm(){
        ModelAndView modelAndView=new ModelAndView("/form");
        modelAndView.addObject("product",new Product());
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView create(@ModelAttribute("product") Product product){
        int randomId=(int)Math.random()*10000;
        product.setId(randomId);
        this.productService.save(product);
        ModelAndView modelAndView=new ModelAndView("/form");
        modelAndView.addObject("product",product);
        return modelAndView;
    }
}
