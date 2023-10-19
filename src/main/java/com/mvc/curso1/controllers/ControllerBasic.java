package com.mvc.curso1.controllers;

import com.mvc.curso1.model.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/home")
public class ControllerBasic {

    public List<Post> getPosts(){
        ArrayList<Post> post = new ArrayList<>();
        post.add(new Post(1, "lorem ipsum","https://imagenes.elpais.com/resizer/pThYBFDcSh9QysXd-WFiwQZiNg8=/100x100/s3.amazonaws.com/arc-authors/prisa/91f57e2a-cba9-4510-af87-6579868d4217.png",new Date(),"titulo nuevo"));

        return post;
    }

    @GetMapping(path="/post")
    public String saludar(Model model){
        model.addAttribute("posts", this.getPosts());
        return "index";
    }
}
