package org.project.springbootblog.service;

import org.project.springbootblog.entity.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    List<Post> getAll();

    //List<Post> findLatest3();

    Optional<Post> getById(Long id);

    Post create(Post post);

    Post update(Post post);

    void deleteById(Long id);
}
