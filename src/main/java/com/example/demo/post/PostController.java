package com.example.demo.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post")
public class PostController {
    //    TODO: Avoid field injection
    @Autowired
    private PostRepository postRepository;

    @GetMapping
    public Iterable<Post> getPosts() {
        return postRepository.findAll();
    }
}
