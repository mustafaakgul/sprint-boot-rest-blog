package com.example.blog.controllers;

import com.example.blog.models.Post;
import com.example.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class HomeController {

    @Autowired
    private PostService postService;

    @RequestMapping("/last7")
    public String index(Model model) {
        List<Post> latest = postService.findLatest7();
        model.addAttribute("latest7posts", latest);

        List<Post> latest2Posts = latest.stream()
                .limit(2).collect(Collectors.toList());
        model.addAttribute("latest2posts", latest2Posts);

        return "index";
    }
}