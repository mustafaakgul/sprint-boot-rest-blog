package org.project.springbootblog.repository;

import org.project.springbootblog.entity.Post;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {

    //List<Post> findLatest3Posts(PageRequest of);
}
