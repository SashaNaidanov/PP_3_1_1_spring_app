package ru.naidanov.springbootapplication.spring_boot_app.dao;

import ru.naidanov.springbootapplication.spring_boot_app.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    User getUserById(Long id);
    void remove(Long id);
    List<User> getAllUsers();
}
