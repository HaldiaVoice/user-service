package com.user.controller;

import com.user.models.AllUsersList;
import com.user.models.User;
import com.user.service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class Controller {

    @Autowired
    UserServices userServices;

    @PostMapping("/user")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User res = userServices.createUser(user);
        if(res!=null){
          return new ResponseEntity<User>(res, HttpStatus.CREATED);
        }
        return new ResponseEntity("Error while creating", HttpStatus.FAILED_DEPENDENCY);
    }
    @GetMapping("/user")
    public ResponseEntity<AllUsersList> getAllUsers(){
        return new ResponseEntity<>(userServices.getAll(),HttpStatus.OK);
    }

}
