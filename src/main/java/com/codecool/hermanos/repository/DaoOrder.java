package com.codecool.hermanos.repository;

import com.codecool.hermanos.model.Order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface DaoOrder extends JpaRepository<Order, Long> {
}