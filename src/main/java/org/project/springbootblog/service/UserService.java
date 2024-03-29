package org.project.springbootblog.service;

import org.project.springbootblog.entity.User;
import org.project.springbootblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public List<User> createUserList(List<User> list) {
        return userRepository.saveAll(list);
    }

    public List<User> getUserList() {
        return userRepository.findAll();
    }

    public User getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUserById(User user) {
        Optional<User> userFound = userRepository.findById(user.getId());

        if (userFound.isPresent()) {
            User userUpdate = userFound.get();
            userUpdate.setFirstName(user.getFirstName());
            userUpdate.setLastName(user.getLastName());
            userUpdate.setAge(user.getAge());

            return userRepository.save(user);
        } else {
            return null;
        }
    }

    public String deleteUserById(long id) {
        userRepository.deleteById(id);
        return "User "+ id +" deleted";
    }

}