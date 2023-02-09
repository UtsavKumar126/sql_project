package com.example.sql_project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositery extends JpaRepository<User,UserCK> {
}
