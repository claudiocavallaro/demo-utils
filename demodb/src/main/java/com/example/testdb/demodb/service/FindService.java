package com.example.testdb.demodb.service;

import com.example.testdb.demodb.model.User;
import com.example.testdb.demodb.persistence.UserRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FindService {

    @Autowired
    private UserRepository repo;

    public String findAll() {
        List<User> findAllList = new ArrayList<>();
        repo.findAll().forEach(findAllList::add);
        return new Gson().toJson(findAllList);
    }

    public String findName(String nome){
        return repo.getNome(nome);
    }
}