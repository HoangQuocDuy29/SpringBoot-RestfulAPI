package vn.hoidanit.jobhunter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.hoidanit.jobhunter.domain.User;
import vn.hoidanit.jobhunter.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //@GetMapping("/user/create")
    @PostMapping("/user")
    public User createNewUser(@RequestBody User postManUser ) {

    
       User eircUser =  this.userService.handleCreateUser(postManUser);

        return eircUser;
    }
    
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") long id) {
        this.userService.handleDeleteUser(id);
        return "eircUser";
    }

    // FETCH User by id
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") long id) {
        return this.userService.fetchUserById(id);
    }

    // FETCH all user
    @GetMapping("/user")
    public List<User> getAllUser () {
        return this.userService.fetchAllUsers();
    }
    

}
