package com.claudiocavallaro.app.persistence.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.claudiocavallaro.app.demodb.UserDto;
import com.claudiocavallaro.app.persistence.entities.UserEntity;
import com.claudiocavallaro.app.persistence.repositories.UserRepository;
import org.springframework.util.StringUtils;

@Service
public class DemoDbServiceImpl implements DemoDbService{
	
	@Autowired
	private UserRepository repository;

	@Override
	public UserDto loadFromId(long id) {
		Optional<UserEntity> optional = repository.findById(id);
		if (optional.isPresent()) {
			UserEntity entity = optional.get();
			UserDto dto = new UserDto();
			dto.setId(entity.getId());
			dto.setNome(entity.getNome());
			dto.setCognome(entity.getCognome());
			return dto;
		}
		return null;
	}

	@Override
	public String getNome(String nome) {
		return repository.getNome(nome);
	}

	@Override
	public boolean insert(UserDto dto) {
		UserEntity entity = new UserEntity();
		entity.setNome(dto.getNome());
		entity.setCognome(dto.getCognome());
		entity.setId(dto.getId());
		UserEntity save = repository.save(entity);
        return save.getNome() != null && save.getCognome() != null;
	}

	@Override
	public List<UserDto> findAll() {
		List<UserEntity> all = repository.findAll();
		List<UserDto> userDtos = new ArrayList<>();
		for (UserEntity entity : all){
			UserDto dto = new UserDto();
			dto.setId(entity.getId());
			dto.setNome(entity.getNome());
			dto.setCognome(entity.getCognome());
			userDtos.add(dto);
		}
		return userDtos;
	}

}
