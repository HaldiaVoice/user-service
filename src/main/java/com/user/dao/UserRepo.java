package com.user.dao;

import com.user.models.AllUsersList;
import com.user.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRepo {

    @Autowired
    UserMongoRepository userRepo;

    @Autowired
    AllUsersList usersList;

    public User createUser(User user){
        return userRepo.save(user);
    }

    public AllUsersList getAll(){
        usersList.setAllUsers(userRepo.findAll());
        return usersList;
    }

}
