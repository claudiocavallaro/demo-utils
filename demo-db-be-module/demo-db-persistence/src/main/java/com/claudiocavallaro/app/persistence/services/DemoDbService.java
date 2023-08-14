package com.claudiocavallaro.app.persistence.services;

import com.claudiocavallaro.app.demodb.UserDto;

import java.util.List;

public interface DemoDbService {
	
	UserDto loadFromId(long id);
	String getNome(String nome);
	boolean insert(UserDto dto);
	List<UserDto> findAll();

}
