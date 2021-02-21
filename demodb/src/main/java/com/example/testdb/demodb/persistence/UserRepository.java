package com.example.testdb.demodb.persistence;

import com.example.testdb.demodb.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    @Query(value = "select nome \n" +
            "from userdb\n" +
            "where nome = ?1", nativeQuery = true)
    public String getNome(String nome);
}
