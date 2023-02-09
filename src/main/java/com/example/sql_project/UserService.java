package com.example.sql_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepositery userRepositery;
    public String add(User user) {
        userRepositery.save(user);
        return "Added successfully";
    }

    public User find(UserCK userCK) {
        return userRepositery.findById(userCK).get();
    }


}
