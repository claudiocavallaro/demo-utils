package com.claudiocavallaro.app.be.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.claudiocavallaro.app.demodb.UserDto;
import com.claudiocavallaro.app.inbound.models.UserModels;
import com.claudiocavallaro.app.persistence.services.DemoDbService;

import java.util.ArrayList;
import java.util.List;

@Component
public class DemoDbFacadeImpl implements DemoDbFacade {

	@Autowired
	private DemoDbService service;

	@Override
	public UserModels loadUser(Long id) {
		UserDto dto = service.loadFromId(id);
		UserModels model = new UserModels();
		model.setId(dto.getId());
		model.setNome(dto.getNome());
		model.setCognome(dto.getCognome());
		return model;
	}

	@Override
	public String getNome(String nome) {
		return service.getNome(nome);
	}

	@Override
	public List<UserModels> getAll() {
		List<UserDto> all = service.findAll();
		List<UserModels> list = new ArrayList<>();
 		for(UserDto dto : all){
			 UserModels models = new UserModels();
			 models.setId(dto.getId());
			 models.setCognome(dto.getCognome());
			 models.setNome(dto.getNome());
			 list.add(models);
		}
		return list;
	}

	@Override
	public Boolean save(UserDto dto) {
		return service.insert(dto);
	}

}
