package com.example.testdb.demodb.persistence;

import com.example.testdb.demodb.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
