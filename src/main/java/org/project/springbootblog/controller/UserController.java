package org.project.springbootblog.controller;

import org.project.springbootblog.entity.User;
import org.project.springbootblog.service.UserService;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getUserList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<User>> getUserById(@PathVariable int id) {
        Optional<User> user = Optional.ofNullable(this.userService.getUserById(id));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("")
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.ok(this.userService.createUser(user));
    }

    @PostMapping("/multiple")
    public ResponseEntity<List<User>> addUsers(@RequestBody List<User> list) {
        return ResponseEntity.ok(this.userService.createUserList(list));
    }

    @PutMapping("/update")
    public ResponseEntity<User> updateUser(@RequestBody User user) {
        return ResponseEntity.ok().body(this.userService.updateUserById(user));
    }

    @PutMapping("/test")
    public String updateUsernameById(@RequestParam String name, @RequestParam String newName) {
        return name + " updated " + newName;
    }
    //http://127.0.0.1:8081/api/v1/users/test?name=asd&newName=asdf


    @DeleteMapping("/delete/{id}")
    public HttpStatus deleteUser(@PathVariable int id) {
        this.userService.deleteUserById(id);
        return HttpStatus.OK;
    }
}
