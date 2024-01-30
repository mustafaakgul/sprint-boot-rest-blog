package com.example.blog.services;

import com.example.blog.models.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> findAll();

    List<Post> findLatest7();

    Optional<Post> findById(Long id);

    Post create(Post post);

    Post edit(Post post);

    void deleteById(Long id);
}