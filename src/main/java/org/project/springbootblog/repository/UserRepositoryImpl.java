package org.project.springbootblog.repository;

import org.project.springbootblog.entity.User;

public abstract class UserRepositoryImpl implements UserRepository {

    public User findUserByEmail(String email){
        User user = new User(email,"123456");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        return user;
    }
}
