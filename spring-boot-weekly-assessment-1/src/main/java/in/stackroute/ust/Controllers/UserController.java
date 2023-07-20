package in.stackroute.ust.Controllers;

import in.stackroute.ust.Domain.User;
import in.stackroute.ust.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.status(HttpStatus.FOUND).body(userRepository.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.FOUND).body(userRepository.findById(id).get());
    }
    @PostMapping("")
    public ResponseEntity<User> create(@RequestBody User user){
        userRepository.save(user);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id,@RequestBody User user){
        User existing = userRepository.findById(id).get();
        existing.setId(user.getId());
        existing.setName(user.getName());
        existing.setEmail(user.getEmail());
        existing.setPassword(user.getPassword());
        userRepository.save(existing);
        return ResponseEntity.status(HttpStatus.OK).body(existing);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List<User>> delete(@PathVariable Long id){
        userRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body(userRepository.findAll());
    }
}