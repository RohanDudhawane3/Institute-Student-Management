package com.example.inventory_backend.service;

import org.springframework.stereotype.Service;
import com.example.inventory_backend.model.User;

import java.util.List;

@Service
public interface UserService {
    //create a user
    public User createUser(User user);
    //read users
    public List<User> getUsers();
    //read user by id
    public User getUserById(long id);

    //delete user by id
    public void deleteUser(long id);
    //update user by id
    public User updateUser(User user,long id);
}
