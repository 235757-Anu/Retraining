package in.stackroute.ust.controller;

import in.stackroute.ust.domain.User;
import in.stackroute.ust.repository.UserRepository;
import in.stackroute.ust.service.UserPersistenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserPersistenceService userPersistenceService;

    // GET /api/v1/users?email=email
    @GetMapping("/email")
    public ResponseEntity<User> getUserEmail(@RequestParam String email){
        Optional<User> findemail=userPersistenceService.findByEmail(email);
        if(findemail.isPresent())
        {
            return ResponseEntity.status(HttpStatus.OK).body(findemail.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
    // GET /api/v1/users?email=email&password=password
    @GetMapping("/email&password")
    public ResponseEntity<User> getUser(@RequestParam String email,@RequestParam String password){
        Optional<User> findUser=userPersistenceService.findByEmailAndPassword(email,password);
        if(findUser.isPresent())
        {
            return ResponseEntity.status(HttpStatus.OK).body(findUser.get());
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
