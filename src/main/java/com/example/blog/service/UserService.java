package com.example.blog.service;

import blog.models.User;

import java.util.List;

public class UserService {

    List<User> findAll();
    User findById(Long id);
    User create(User user);
    User edit(User user);
    void deleteById(Long id);

}