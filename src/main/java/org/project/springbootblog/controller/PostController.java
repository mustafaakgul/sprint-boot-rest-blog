package org.project.springbootblog.controller;

import org.project.springbootblog.entity.Post;
import org.project.springbootblog.entity.Post;
import org.project.springbootblog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("")
    public ResponseEntity<List<Post>> getAllPosts() {
        return ResponseEntity.ok(postService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Optional<Post>>> getPostById(@PathVariable long id) {
        Optional<Optional<Post>> post = Optional.ofNullable(this.postService.getById(id));
        return ResponseEntity.ok().body(post);
    }

    @GetMapping("/{id}/ex")
    public ResponseEntity<Post> getPostById(@PathVariable long id) {
        try {
            Post post = postService.getById(id);

            if (post == null) {
                throw new ResourceNotFoundException("Post not found");
            }
            return post;
        } catch (PostServiceException e) {
            throw new PostServiceException("Internal Server Exception while getting exception");
        }
    }

    @PostMapping("")
    public ResponseEntity<Post> addPost(@RequestBody Post post) {
        return ResponseEntity.ok(this.postService.create(post));
    }

    @PutMapping("/update")
    public ResponseEntity<Post> updatePost(@RequestBody Post post) {
        return ResponseEntity.ok().body(this.postService.update(post));
    }

    @DeleteMapping("/delete/{id}")
    public HttpStatus deletePost(@PathVariable long id) {
        this.postService.deleteById(id);
        return HttpStatus.OK;
    }
}
