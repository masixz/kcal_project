package com.cal.kcal.controllers;


import com.cal.kcal.models.Post;
import com.cal.kcal.repo.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @Autowired
    private PostRepository postRepository;


    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("title","Insert");
        return "home";
    }
    @GetMapping("/database")
    public String database(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("databases","Databases");
        return "database";
    }
}