package com.example.demo.post;

import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final PostRepository postRepository;

    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> findAll() {
        return postRepository.findAll();
    }
}
