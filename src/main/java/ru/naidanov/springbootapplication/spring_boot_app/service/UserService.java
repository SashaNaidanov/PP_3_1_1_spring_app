package ru.naidanov.springbootapplication.spring_boot_app.service;

import ru.naidanov.springbootapplication.spring_boot_app.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User getUserById(Long id);
    void remove(Long id);
    List<User> getAllUsers();
}
