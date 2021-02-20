package com.example.testdb.demodb.persistence;

import com.example.testdb.demodb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
