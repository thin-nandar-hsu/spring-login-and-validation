package com.example.jpasigninsignout.dao;

import com.example.jpasigninsignout.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDao extends JpaRepository<User,Integer> {

    Optional<User> findUserByUserName(String userName);
}
