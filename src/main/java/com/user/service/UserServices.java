package com.user.service;

import com.user.dao.UserMongoRepository;
import com.user.dao.UserRepo;
import com.user.models.AllUsersList;
import com.user.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    UserRepo userRepo;

    public User createUser(User user){
        return userRepo.createUser(user);
    }

    public AllUsersList getAll(){
        return userRepo.getAll();
    }

}
