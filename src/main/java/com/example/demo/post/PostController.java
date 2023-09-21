package com.example.demo.post;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class PostController {
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("posts", postService.findAll());

        return modelAndView;
    }
}
