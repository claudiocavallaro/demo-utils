package com.claudiocavallaro.app.persistence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.claudiocavallaro.app.persistence.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{
	
    @Query(value = "select nome \n" +
            "from userdb\n" +
            "where nome = ?1", nativeQuery = true)
    String getNome(String nome);

}
