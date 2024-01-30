package com.example.blog.controllers;

import com.example.blog.models.Post;
import com.example.blog.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;;

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

    @GetMapping(value = "")
    public String index(@RequestParam(defaultValue = "1") int page, Model model) {
        page = page < 1 ? 0 : page - 1;
        Page<Post> posts = postService.getAllPublishedPostsByPage(page, appSetting.getPageSize());

        model.addAttribute("totalPages", posts.getTotalPages());
        model.addAttribute("posts", posts);
        model.addAttribute("page", page + 1);
        return "index/home";
    }
}