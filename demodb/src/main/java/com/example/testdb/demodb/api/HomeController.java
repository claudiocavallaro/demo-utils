package com.example.testdb.demodb.api;

import com.example.testdb.demodb.model.User;
import com.example.testdb.demodb.service.AddService;
import com.example.testdb.demodb.service.FindService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @Autowired
    private FindService findService;

    @Autowired
    private AddService addService;

    @GetMapping("/home")
    @ResponseBody
    public String home(){
        return "HOME CONTROLLER";
    }

    @GetMapping("/findall")
    public String findAll(){
        return findService.findAll();
    }

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        boolean result = addService.addUser(user);
        if (result){
            return "Success!";
        } else {
            return "Not saved!";
        }
    }

    @GetMapping("/findName")
    @ResponseBody
    public String findName(@RequestParam String nome){
        return findService.findName(nome);
    }

    @GetMapping("/findNomeCognome")
    @ResponseBody
    public String findByNomeCognome(@RequestParam String nome, @RequestParam String cognome){
        User byNomeCognome = findService.findByNomeCognome(nome, cognome);
        return new Gson().toJson(byNomeCognome);
    }


}
