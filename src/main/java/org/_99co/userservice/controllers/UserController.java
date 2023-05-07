package org._99co.userservice.controllers;

import org._99co.userservice.entities.User;
import org._99co.userservice.helpers.ResponseHelper;
import org._99co.userservice.models.PagingRequest;
import org._99co.userservice.models.Response;
import org._99co.userservice.services.UserService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "")
    public Response<List<User>> getAllUser(@RequestParam(value = "page_num", defaultValue = "1") Integer page
                                            , @RequestParam(value = "page_size", defaultValue = "10") Integer size){
        List<User> allUsers = userService.getAllUsers(page, size);
        return ResponseHelper.ok(allUsers);
    }

    @GetMapping(path = "/{id}")
    public Response<User> getUserById(@PathVariable Integer id){
        User user = userService.getUser(id);
        return ResponseHelper.ok(user);
    }

    @PostMapping(path = "")
    public Response<User> createUser(String name){
        User user = userService.createUser(name);
        return ResponseHelper.ok(user);
    }
}
