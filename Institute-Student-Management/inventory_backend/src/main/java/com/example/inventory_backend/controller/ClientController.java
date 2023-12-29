package com.example.inventory_backend.controller;

import com.example.inventory_backend.model.User;
import com.example.inventory_backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientController {
    @Autowired
    private UserService userService;

    //hello world
    @GetMapping("/")
    public String helloworld(){
        return "Hello World!";
    }
    //rest API Crud - Create USer - POST
    // Read User - GET
    // Delete User - DELETE
    // Update User - PUT


    //create User
    @PostMapping(value = "/add",consumes = "application/json")
    public User createUser(@RequestBody User user){
        User user1 = userService.createUser(user);
        return user1;
    }

    //Read Users
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    //Update user by id
    @PutMapping("/update/{id}")
    public User updateUserById(@RequestBody User user,@PathVariable("id") long id){
        return userService.updateUser(user,id);
    }

    //Delete User by id
    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id){
        userService.deleteUser(id);
        return "User Deleted Successfully";
    }

    //Get User By id
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id){
        return userService.getUserById(id);
    }
}
