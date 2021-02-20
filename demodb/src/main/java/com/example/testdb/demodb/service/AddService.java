package com.example.testdb.demodb.service;

import com.example.testdb.demodb.model.User;
import com.example.testdb.demodb.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddService {

    @Autowired
    private UserRepository repo;

    public boolean addUser(User user){
        try {
            repo.save(user);
            return true;
        } catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

}
