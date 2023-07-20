package org.example.controller;

import org.example.domain.User;
import org.example.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("")
    public ResponseEntity<List<User>>  getAll(){
        var all=userRepository.findAll();
        if(all.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok().body(all);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable int id){
        Optional<User> one=userRepository.findById(id);
        if(one.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(one.get());
    }
    @PostMapping("")
    public ResponseEntity<User> create(@RequestBody User user){
        return ResponseEntity.ok().body(userRepository.save(user));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<User>> delete(@PathVariable int id){
        var del=userRepository.findById(id);
        if(del.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        userRepository.deleteById(id);
        return ResponseEntity.ok().body(userRepository.findAll());
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> update(@PathVariable int id,@RequestBody User user){
        var up=userRepository.findById(id);
        if(up.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        var existing=up.get();
        existing.setId(user.getId());
        existing.setName(user.getName());
        userRepository.save(existing);
        return ResponseEntity.ok().body(existing);
    }
}
