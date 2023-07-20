package org.example.controller;

import org.example.domain.User;
import org.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        userRepository.save(user);
        return ResponseEntity.ok().body(user);
    }
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        final var existing = userRepository.findByNameAndPassword(user.getName(), user.getPassword());
        if(existing.isPresent()) {
            return ResponseEntity.ok().body("Login successfully");
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid");
    }

}
