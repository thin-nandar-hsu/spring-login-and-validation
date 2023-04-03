package com.example.jpasigninsignout.dao;

import com.example.jpasigninsignout.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleDao extends JpaRepository<Role,Integer>{
    Optional<Role> findRoleByName(String name);
}
