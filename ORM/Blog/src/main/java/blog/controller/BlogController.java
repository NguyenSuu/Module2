package blog.controller;

import blog.model.Blog;
import blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BlogController {
    @Autowired
    private BlogService blogService;
    @GetMapping("/")
    public ModelAndView listBlog(){
        List<Blog> blogs=blogService.findAll();
        ModelAndView modelAndView=new ModelAndView("/blog/list");
        modelAndView.addObject("blogs",blogs);
        return modelAndView;
    }
    @GetMapping("/add-message")
    public ModelAndView formMessage(){
        ModelAndView modelAndView=new ModelAndView("/blog/create");
        modelAndView.addObject("blog",new Blog());
        return modelAndView;
    }
    @PostMapping("/add-message")
    public ModelAndView saveMessage(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView=new ModelAndView("/blog/create");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("message", "New blog create successfully");
        return modelAndView;
    }
    @GetMapping("/edit-blog/{id}")
    public ModelAndView formEdit(@PathVariable Long id){
        ModelAndView modelAndView=new ModelAndView("/blog/edit");
        Blog blog=blogService.findById(id);
        modelAndView.addObject("blog",blog);
        return modelAndView;
    }
    @PostMapping("/edit-blog")
    public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog){
        blogService.save(blog);
        ModelAndView modelAndView=new ModelAndView("/blog/edit");
        modelAndView.addObject("blog",blog);
        modelAndView.addObject("message", "Blog updated successfully");
        return modelAndView;
    }
    @GetMapping("/delete-blog/{id}")
    public ModelAndView formDelete(@PathVariable Long id){
        Blog blog=blogService.findById(id);
        ModelAndView modelAndView=new ModelAndView("/blog/delete");
        modelAndView.addObject("blog",blog);
        return modelAndView;
    }
    @PostMapping("/delete-blog")
    public String deleteBlog(@ModelAttribute("blog") Blog blog){
        blogService.remove(blog.getId());
        return "redirect:/";
    }
}
