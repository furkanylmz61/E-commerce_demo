package com.ylmaz.demoprojectecommerce.controller;

import com.ylmaz.demoprojectecommerce.Repository.UserRepository;
import com.ylmaz.demoprojectecommerce.model.Product;
import com.ylmaz.demoprojectecommerce.model.Users;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UserRepository userRepository;

    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<Users> getAllProducts() {
        return userRepository.findAll();
    }

    @PostMapping
    public Users createUser(@RequestBody Users users){
        return userRepository.save(users);
    }

}
