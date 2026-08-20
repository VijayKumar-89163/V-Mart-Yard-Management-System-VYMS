package com.example.ymsvmart.service;

import com.example.ymsvmart.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);
    User getUser(String id);
    User updateUser(User user);
    User deleteUser(String id);
    User getUserByEmail(String email);
    List<User> getAllUsers();
}
