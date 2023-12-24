package com.smmc.usermicroservice.controller;

import com.smmc.usermicroservice.dto.UserDetailsDTO;
import com.smmc.usermicroservice.entity.UserDetails;
import com.smmc.usermicroservice.service.UserService;
import com.smmc.usermicroservice.service.impl.UserServiceImpl;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/smmc")
public class UserDetailsController {

    @Autowired
    private UserService userService;
    @GetMapping("/users/{userId}")
    public List<UserDetailsDTO> getByUid(@PathVariable ObjectId userId){
        return userService.getByUid(userId);
    }

    @PostMapping("/users/createUser")
    public ResponseEntity createUser(@RequestBody UserDetails userDetails){
        userService.createUser(userDetails);
        return ResponseEntity.status(HttpStatus.CREATED).body("userCreated in Database");
    }
}
