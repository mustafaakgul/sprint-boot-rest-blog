package com.example.blog.services;

import com.example.blog.model.Post;

import java.util.List;

public interface PostService {
    List<Post> findAll();
    List<Post> findLatest7();
    Post findById(Long id);
    Post create(Post post);
    Post edit(Post post);
    void deleteById(Long id);
}