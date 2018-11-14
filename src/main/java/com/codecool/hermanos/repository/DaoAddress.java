package com.codecool.hermanos.repository;

import com.codecool.hermanos.model.Address;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface DaoAddress extends JpaRepository<Address, Long> {
}