package com.claudiocavallaro.app.be.apis;

import com.claudiocavallaro.app.demodb.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.claudiocavallaro.app.be.facade.DemoDbFacade;
import com.claudiocavallaro.app.inbound.apis.UserApi;
import com.claudiocavallaro.app.inbound.models.UserModels;

import java.util.List;

@RestController
public class UserApiImpl implements UserApi{
	
	@Autowired
	private DemoDbFacade facade;

	@Override
	public UserModels loadUser(Long id) {
		return facade.loadUser(id);
	}

	@Override
	public String getNome(String nome) {
		return facade.getNome(nome);
	}

	@Override
	public List<UserModels> getAll() {
		return facade.getAll();
	}

	@Override
	public Boolean save(UserDto dto) {
		return facade.save(dto);
	}

}
