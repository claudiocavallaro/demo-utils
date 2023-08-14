package com.claudiocavallaro.app.inbound.apis;

import com.claudiocavallaro.app.demodb.UserDto;
import org.springframework.web.bind.annotation.*;

import com.claudiocavallaro.app.inbound.models.UserModels;

import java.util.List;

@RestController
@RequestMapping("/prova")
public interface UserApi {
	
	@GetMapping("/{id}")
	UserModels loadUser(@PathVariable Long id);
	
	@GetMapping("/getNome")
	String getNome(@RequestParam String nome);

	@GetMapping("/getAll")
	List<UserModels> getAll();

	@PostMapping("/add")
	Boolean save(@RequestBody UserDto dto);

}
