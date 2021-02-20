package com.example.testdb.demodb.api;

import com.example.testdb.demodb.service.FindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private FindService findService;

    @GetMapping("/home")
    @ResponseBody
    public String home(){
        return "HOME CONTROLLER";
    }


    @GetMapping("/findall")
    public String findAll(){
        return findService.findAll();
    }
}
