package com.example.Register.Controller;

import com.example.Register.models.UserDetails;
import com.example.Register.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/add")
    public UserDetails addUser(@RequestBody UserDetails user) {
        return userRepository.save(user);
    }

    @GetMapping("/all")
    public List<UserDetails> getAllUsers() {
        return userRepository.findAll();
    }
}
