package com.claudiocavallaro.app.be.facade;

import com.claudiocavallaro.app.demodb.UserDto;
import com.claudiocavallaro.app.inbound.models.UserModels;

import java.util.List;

public interface DemoDbFacade {
	
	UserModels loadUser(Long id);
	
	String getNome(String nome);

	List<UserModels> getAll();

	Boolean save(UserDto dto);

}
