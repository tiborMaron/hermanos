package com.codecool.hermanos.repository;

import com.codecool.hermanos.model.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface DaoUsers extends JpaRepository<Users, Long> {
    Users findUserByEmail(String email);
}