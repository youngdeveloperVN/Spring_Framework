package com.demo.service;

import com.demo.entities.User;

public interface UserService {
    public User findUserByEmail(String email);
    public void saveUser(User user);
}
