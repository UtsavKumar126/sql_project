package com.example.sql_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/add")
    public String addUser(@RequestBody User user){
        return userService.add(user);
    }
    @GetMapping("/find")
    public User findUser(@RequestParam("id") UserCK userCK){
        return userService.find(userCK);
    }
}
