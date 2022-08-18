package com.example.shopapi.service;

import com.example.shopapi.model.User;
import com.example.shopapi.repository.UserRepository;

public interface UserService {
    User addUser(User user);
}
