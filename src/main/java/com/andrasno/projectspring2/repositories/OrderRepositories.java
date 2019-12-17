package com.andrasno.projectspring2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andrasno.projectspring2.entities.Order;

public interface OrderRepositories extends JpaRepository<Order, Integer> {

}
