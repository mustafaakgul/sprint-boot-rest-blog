package org.project.springbootblog.service;

import org.project.springbootblog.entity.Post;
import org.project.springbootblog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Primary
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAll() {
        return this.postRepository.findAll();
    }

//    @Override
//    public List<Post> findLatest3() {
//        return this.postRepository.findLatest3Posts(PageRequest.of(0, 3));
//    }

    @Override
    public Optional<Post> getById(Long id) {
        //return Optional.empty();
        return this.postRepository.findById(id);
    }

    @Override
    public Post create(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public Post update(Post post) {
        return this.postRepository.save(post);
    }

    @Override
    public void deleteById(Long id) {
        this.postRepository.deleteById(id);
    }
}
